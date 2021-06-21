package com.example.aislechallenge.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.aislechallenge.R;
import com.example.aislechallenge.utils.ViewModelClass;
import com.example.aislechallenge.model.LoginModel;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class PhoneNumberFragment extends Fragment {

    ViewModelClass viewModelClass = null;
    TextInputEditText phoneEditText;
    String phone = "";

    ProgressBar progressBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phone_number, container, false);

        viewModelClass = ViewModelProviders.of(PhoneNumberFragment.this).get(ViewModelClass.class);
        viewModelClass.getRetrofitObj("");


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        phoneEditText = view.findViewById(R.id.number_edit_text);
        progressBar = view.findViewById(R.id.phone_progress_bar);

        Button continueButton = view.findViewById(R.id.continue_button);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get the otp
                progressBar.setVisibility(View.VISIBLE);
                sendPhoneNumberForLogin();

            }
        });
    }

    private void sendPhoneNumberForLogin() {

        if (!Objects.requireNonNull(phoneEditText.getText()).toString().equals("")) {
            viewModelClass.loginUser(getActivity(), "+91" + phoneEditText.getText().toString()).observe(PhoneNumberFragment.this, new Observer<LoginModel>() {
                @Override
                public void onChanged(LoginModel loginModel) {
                    if (loginModel.getStatus()) {
                        //change the fragment
                        progressBar.setVisibility(View.GONE);
                        Bundle bundle = new Bundle();
                        bundle.putString("phone", "+91" + phoneEditText.getText().toString());
                        OtpFragment otpFragment = new OtpFragment();
                        otpFragment.setArguments(bundle);
                        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login_frame_layout, otpFragment).commit();
                    }
                }
            });
        } else {
            Toast.makeText(getContext(), "Enter the number", Toast.LENGTH_LONG).show();
        }

    }


    @Override
    public void onResume() {
        super.onResume();
    }
}