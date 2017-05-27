package pujiwahono.app.advancepuji.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;



public class OkHttpTime {

    public static OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(15000L, TimeUnit.MILLISECONDS)
            .readTimeout(1500L, TimeUnit.MILLISECONDS)
            .build();

}
