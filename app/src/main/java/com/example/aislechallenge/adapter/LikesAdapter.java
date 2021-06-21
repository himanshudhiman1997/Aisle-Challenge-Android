package com.example.aislechallenge.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.aislechallenge.utils.BlurTransformation;
import com.example.aislechallenge.R;
import com.example.aislechallenge.model.ProfileModel;

import java.util.List;

import io.reactivex.annotations.NonNull;

public class LikesAdapter extends RecyclerView.Adapter<LikesAdapter.MyViewHolder> {

    private List<ProfileModel.Likes.Profile__1> list;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView profileImage;
        TextView nameTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            profileImage = itemView.findViewById(R.id.like_user_image_view);
            nameTextView = itemView.findViewById(R.id.like_user_name_text_view);
        }
    }

    public LikesAdapter(List<ProfileModel.Likes.Profile__1> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public LikesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_likes, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LikesAdapter.MyViewHolder myViewHolder, int i) {
        ProfileModel.Likes.Profile__1 obj = list.get(i);
        myViewHolder.nameTextView.setText(obj.getFirstName());

        Glide.with(context).load(obj.getAvatar()).transform(new BlurTransformation(context)).into(myViewHolder.profileImage);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
