package com.boarding_labs.investradex.ui.liquid.adapter;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.boarding_labs.investradex.R;
import com.boarding_labs.investradex.util.entities.Liquid45;

import java.util.List;

public class LiquidListAdapter extends RecyclerView.Adapter<LiquidListAdapter.ViewHolder>{
    private List<Liquid45> liquid45List;
    private Context context;
    private Dialog dialog;

    public LiquidListAdapter(List<Liquid45> liquid45List, Context context) {
        this.liquid45List = liquid45List;
        this.context = context;
    }

    @NonNull
    @Override
    public LiquidListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_liquid, parent, false);

        return new LiquidListAdapter.ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull LiquidListAdapter.ViewHolder holder, int position) {
        final Liquid45 liquid45 = liquid45List.get(position);
        holder.tvNo.setText(liquid45.getNr().toString());
        holder.tvAct.setText(liquid45.getAct());
        holder.tvSector.setText(liquid45.getSector());
        holder.tvCode.setText(liquid45.getCode());
        holder.tvCandle.setText(liquid45.getCandle());
        holder.tvCandlesDaily.setText(liquid45.getCandlesDaily());
        holder.tvChg.setText(liquid45.getChg().toString());
        holder.tvO.setText(liquid45.getO().toString());
        holder.tvH.setText(liquid45.getH().toString());
        holder.tvL.setText(liquid45.getL().toString());
        holder.tvWmy.setText(liquid45.getWmy());
        holder.tvOpen.setText(liquid45.getFrg());
        holder.tvClose.setText(liquid45.getDcs());
        switch (liquid45.getX()) {
            case 0:
                holder.layValue.setBackgroundColor(Color.parseColor("#ffffff"));
                break;
            case 1:
                holder.layValue.setBackgroundColor(Color.parseColor("#00b200"));
                break;
            case 2:
                holder.layValue.setBackgroundColor(Color.parseColor("#58dc00"));
                break;
        }


    }

    @Override
    public int getItemCount() {
        return liquid45List.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNo, tvAct, tvSector, tvCode, tvCandle, tvCandlesDaily, tvChg, tvO, tvH, tvL, tvWmy, tvOpen, tvClose;
        LinearLayout layValue;

        ViewHolder(View v){
            super(v);
            tvNo = v.findViewById(R.id.tvNo);
            tvAct = v.findViewById(R.id.tvAct);
            tvSector = v.findViewById(R.id.tvSector);
            tvCandle = v.findViewById(R.id.tvCandle);
            tvCode = v.findViewById(R.id.tvCode);
            tvCandlesDaily = v.findViewById(R.id.tvCandlesDaily);
            tvChg = v.findViewById(R.id.tvChg);
            tvO = v.findViewById(R.id.tvO);
            tvH = v.findViewById(R.id.tvH);
            tvL = v.findViewById(R.id.tvL);
            tvWmy = v.findViewById(R.id.tvWmy);
            tvOpen = v.findViewById(R.id.tvOpen);
            tvClose = v.findViewById(R.id.tvClose);
            layValue = v.findViewById(R.id.layValue);
        }
    }
}
