package com.example.aislechallenge.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aislechallenge.R;
import com.example.aislechallenge.utils.ViewModelClass;
import com.example.aislechallenge.adapter.LikesAdapter;
import com.example.aislechallenge.model.ProfileModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class DiscoverFragment extends Fragment {

    private static final String TOKEN = "token";
    private ViewModelClass viewModelClass = null;

    private TextView nameAgeTextView;
    private ImageView userImageView;

    private LikesAdapter likesAdapter;
    private RecyclerView likesRecyclerView;
    private String token;

    private ProgressBar progressBar;

    private List<ProfileModel.Likes.Profile__1> likesList = new ArrayList<>();

    public DiscoverFragment() {
        // Required empty public constructor
    }

    public static DiscoverFragment newInstance(String token) {
        DiscoverFragment fragment = new DiscoverFragment();
        Bundle args = new Bundle();
        args.putString(TOKEN, token);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            token = getArguments().getString(TOKEN);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover, container, false);

        viewModelClass = ViewModelProviders.of(DiscoverFragment.this).get(ViewModelClass.class);
        viewModelClass.getRetrofitObj(token);

        nameAgeTextView = view.findViewById(R.id.name_age_text_view);
        userImageView = view.findViewById(R.id.user_image_view);
        likesRecyclerView = view.findViewById(R.id.likes_recycler_view);
        progressBar = view.findViewById(R.id.home_screen_progress_bar);

        return view;
    }

    private void setAdapter() {
        likesAdapter = new LikesAdapter(likesList, getActivity());
        likesRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        likesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        likesRecyclerView.setAdapter(likesAdapter);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        progressBar.setVisibility(View.VISIBLE);
        getProfileData();
    }

    private void getProfileData() {
        viewModelClass.profileList(getActivity()).observe(getViewLifecycleOwner(), new Observer<ProfileModel>() {
            @Override
            public void onChanged(ProfileModel profileModel) {
                //show the data
                progressBar.setVisibility(View.GONE);
                ProfileModel.Invites.Profile profileObj = profileModel.getInvites().getProfiles().get(0);

                nameAgeTextView.setText(profileObj.getGeneralInformation().getFirstName() + ", " + profileObj.getGeneralInformation().getAge());
                Glide.with(requireActivity()).load(profileObj.getPhotos().get(0).getPhoto()).into(userImageView);

                likesList = profileModel.getLikes().getProfiles();
                setAdapter();

            }
        });
    }
}