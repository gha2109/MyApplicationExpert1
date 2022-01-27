package com.meriem.myapplicationexpert.ui.slideshow;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.meriem.myapplicationexpert.CameraActivity;
import com.meriem.myapplicationexpert.R;

public class CameraFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.camera_fragment,container,false);
       Button take_pic= view.findViewById(R.id.take_pic);
       take_pic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent in = new Intent(getActivity(), CameraActivity.class);
               in.putExtra("some","some data");
           }
       });
        return view;
    }
}