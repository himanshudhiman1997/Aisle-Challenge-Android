package com.example.aislechallenge.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit = null;


    public static Retrofit getClient(String authToken) {

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request.Builder ongoing = chain.request().newBuilder();
                        ongoing.addHeader("__cfduid", "df9b865983bd04a5de2cf5017994bbbc71618565720");
                        ongoing.addHeader("Content-Type", "application/json");
                    if (!authToken.equals("")) {
                        ongoing.addHeader("Authorization", authToken);
                    }
                        return chain.proceed(ongoing.build());
                    }
                })
                .build();


        retrofit = new Retrofit.Builder().baseUrl("https://testa2.aisle.co/V1/users/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
        return retrofit;

    }
}
