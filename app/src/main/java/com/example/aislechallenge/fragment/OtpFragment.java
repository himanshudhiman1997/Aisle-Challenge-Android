package com.example.aislechallenge.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aislechallenge.activity.HomeActivity;
import com.example.aislechallenge.R;
import com.example.aislechallenge.utils.ViewModelClass;
import com.example.aislechallenge.model.OtpModel;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;


public class OtpFragment extends Fragment {

    ViewModelClass viewModelClass = null;

    private static final String PHONE = "phone";

    private String phone;

    TextInputEditText otpEditText;
    private ProgressBar progressBar;

    public OtpFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            phone = getArguments().getString(PHONE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_otp, container, false);

        viewModelClass = ViewModelProviders.of(OtpFragment.this).get(ViewModelClass.class);
        viewModelClass.getRetrofitObj("");

        otpEditText = view.findViewById(R.id.otp_edit_text);
        progressBar = view.findViewById(R.id.otp_progress_bar);

        TextView phoneNumberTextView = view.findViewById(R.id.phone_number_text_view);
        phoneNumberTextView.setText(phone);

        phoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.login_frame_layout, new PhoneNumberFragment()).commit();
            }
        });

        Button continueButton = view.findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //verify otp
                progressBar.setVisibility(View.VISIBLE);
                verifyOtp();

            }
        });

        return view;
    }

    private void verifyOtp() {
        if (!Objects.requireNonNull(otpEditText.getText()).toString().equals("")) {
            viewModelClass.verifyOtp(getActivity(), phone, otpEditText.getText().toString()).observe(OtpFragment.this, new Observer<OtpModel>() {
                @Override
                public void onChanged(OtpModel otpModel) {
                    if (otpModel.getToken() != null) {
                        //do the intent to home screen
                        progressBar.setVisibility(View.GONE);
                        Intent homeIntent = new Intent(getActivity(), HomeActivity.class);
                        homeIntent.putExtra("token", otpModel.getToken());
                        startActivity(homeIntent);
                    }

                }
            });
        } else {
            Toast.makeText(getContext(), "Enter the otp", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView otpTimer = view.findViewById(R.id.otp_timer_text_view);

        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                if ((millisUntilFinished / 1000) < 10) {
                    otpTimer.setText("00:0" + (millisUntilFinished / 1000));
                } else {
                    otpTimer.setText("00:" + (millisUntilFinished / 1000));
                }

            }

            public void onFinish() {
                otpTimer.setText(R.string.resend);
            }

        }.start();

    }
}