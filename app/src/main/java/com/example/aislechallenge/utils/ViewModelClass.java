package com.example.aislechallenge.utils;

import android.app.Activity;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.aislechallenge.api.APIClient;
import com.example.aislechallenge.api.APIInterface;
import com.example.aislechallenge.model.LoginModel;
import com.example.aislechallenge.model.OtpModel;
import com.example.aislechallenge.model.ProfileModel;

import org.jetbrains.annotations.NotNull;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewModelClass extends ViewModel {

    APIInterface apiInterface;
    private final MutableLiveData<LoginModel> loginRequest = new MutableLiveData<>();
    private final MutableLiveData<OtpModel> verifyOtpRequest = new MutableLiveData<>();
    private final MutableLiveData<ProfileModel> profileRequest = new MutableLiveData<>();

    public void getRetrofitObj(String authToken) {
        apiInterface = APIClient.getClient(authToken).create(APIInterface.class);

    }

    public LiveData<LoginModel> loginUser(final Activity activity, final String number) {

        Call<LoginModel> call = apiInterface.phoneNumberLogin(number);

        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(@NotNull Call<LoginModel> call, @NotNull Response<LoginModel> response) {
                loginRequest.setValue(response.body());
                assert response.body() != null;
                if (!response.body().getStatus()) {
                    Toast.makeText(activity, "Enter the phone number mentioned in the requirements", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<LoginModel> call, @NotNull Throwable t) {
                Toast.makeText(activity, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
        return loginRequest;
    }

    public LiveData<OtpModel> verifyOtp(final Activity activity, final String number, final String otp) {

        Call<OtpModel> call = apiInterface.verifyOtp(number, otp);

        call.enqueue(new Callback<OtpModel>() {
            @Override
            public void onResponse(@NotNull Call<OtpModel> call, @NotNull Response<OtpModel> response) {
                verifyOtpRequest.setValue(response.body());
                assert response.body() != null;
                if (response.body().getToken() == null) {
                    Toast.makeText(activity, "Enter the correct otp", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<OtpModel> call, @NotNull Throwable t) {
                Toast.makeText(activity, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
        return verifyOtpRequest;
    }

    public LiveData<ProfileModel> profileList(final Activity activity) {
        Call<ProfileModel> call = apiInterface.profileList();
        call.enqueue(new Callback<ProfileModel>() {
            @Override
            public void onResponse(@NotNull Call<ProfileModel> call, @NotNull Response<ProfileModel> response) {
                profileRequest.setValue(response.body());
            }

            @Override
            public void onFailure(@NotNull Call<ProfileModel> call, @NotNull Throwable t) {
                Toast.makeText(activity, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return profileRequest;
    }

}
