package com.example.aislechallenge.api;


import com.example.aislechallenge.model.LoginModel;
import com.example.aislechallenge.model.OtpModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIInterface {

    @FormUrlEncoded
    @POST("phone_number_login")
    Call<LoginModel> phoneNumberLogin(@Field("number") String phone);

    @FormUrlEncoded
    @POST("verify_otp")
    Call<OtpModel> verifyOtp(@Field("number") String phone, @Field("otp") String otp);
}
