package com.boarding_labs.investradex.ui.liquid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.boarding_labs.investradex.R;
import com.boarding_labs.investradex.ui.liquid.adapter.LiquidListAdapter;
import com.boarding_labs.investradex.util.entities.ErrorParser;
import com.boarding_labs.investradex.util.entities.Liquid45;
import com.boarding_labs.investradex.util.entities.LiquidModel;
import com.boarding_labs.investradex.util.network.Api;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

public class LiquidFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<LiquidModel> liquidModelList;
    private LiquidListAdapter adapter;
    private SwipeRefreshLayout refreshLayout;
    private LiquidViewModel liquidViewModel;
    private TextView tvNoData;

    WebView wb;
    ProgressBar progressBar;
    int PIC_WIDTH = 360;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_liquid, container, false);

        liquidModelList = new ArrayList<>();
        recyclerView = root.findViewById(R.id.recyclerView);
        refreshLayout = root.findViewById(R.id.pullToRefresh);
        tvNoData = root.findViewById(R.id.tvNoData);
        getListLiquid();

        refreshLayout.setOnRefreshListener(() -> {
            adapter.notifyDataSetChanged();
            getListLiquid();
        });

//        wb = root.findViewById(R.id.webView1);
//        progressBar = root.findViewById(R.id.progressBar);
//        wb.getSettings().setJavaScriptEnabled(true);
//        wb.getSettings().setLoadWithOverviewMode(true);
//        wb.getSettings().setUseWideViewPort(true);
//        wb.getSettings().setBuiltInZoomControls(true);
//        wb.getSettings().setDisplayZoomControls(false);
//        wb.getSettings().setPluginState(WebSettings.PluginState.ON);
//        wb.loadUrl("http://www.investradex.com/LQ45");
//        wb.setWebViewClient(new LiquidFragment.AppWebViewClients(progressBar));

        return root;
    }

    private void getListLiquid() {
        refreshLayout.setRefreshing(true);
        Api.apiInterface().getLiquidData().enqueue(new Callback<List<Liquid45>>() {
            @Override
            public void onResponse(Call<List<Liquid45>> call, Response<List<Liquid45>> response) {
                try {
                    refreshLayout.setRefreshing(false);
                    List<Liquid45> liquid45List = response.body();
                    Log.d("JSON", Objects.requireNonNull(liquid45List).get(0).getVToday());
                    if (Objects.requireNonNull(liquid45List).size() < 1) {
                        tvNoData.setVisibility(View.VISIBLE);
                    } else {
                        tvNoData.setVisibility(View.GONE);
                    }

                    adapter = new LiquidListAdapter(liquid45List, getActivity());
                    @SuppressLint("WrongConstant") LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayout.VERTICAL, false);
                    DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                            layoutManager.getOrientation());
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<List<Liquid45>> call, Throwable t) {
                refreshLayout.setRefreshing(false);
                if (t instanceof HttpException) {
                    ResponseBody body = ((HttpException) t).response().errorBody();
                    Gson gson = new Gson();
                    TypeAdapter<ErrorParser> adapter = gson.getAdapter
                            (ErrorParser.class);
                    try {
                        ErrorParser errorParser =
                                adapter.fromJson(Objects.requireNonNull(body).string());
                        Log.i("LOGIN", "Error:" + errorParser.getError());
                        Toast.makeText(getActivity(), errorParser.getError(), Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public class AppWebViewClients extends WebViewClient {
        private ProgressBar progressBar;

        public AppWebViewClients(ProgressBar progressBar) {
            this.progressBar=progressBar;
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }
    }
}