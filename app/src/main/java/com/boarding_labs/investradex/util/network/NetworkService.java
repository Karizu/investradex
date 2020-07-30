package com.boarding_labs.investradex.util.network;

import com.boarding_labs.investradex.util.entities.Liquid45;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkService {

    String URL_LQ45 = "https://gitlab.com/rizkidharmawan20/investradex/-/raw/master/";

    @GET("lq45.json")
    Call<List<Liquid45>> getLiquidData();

}
