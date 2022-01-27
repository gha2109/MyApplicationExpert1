package com.meriem.myapplicationexpert.ui.home;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.meriem.myapplicationexpert.R;
import com.meriem.myapplicationexpert.databinding.FragmentHomeBinding;
import com.meriem.myapplicationexpert.model.Intervention;
import com.meriem.myapplicationexpert.model.intervation_adapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HomeFragment<_List1> extends Fragment {
    TextView textViewdate;
    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private ListView _List1;
    RecyclerView recyclerView;
    List<Intervention> data;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        data=new ArrayList<>();
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        data.add(new Intervention("nue de paradie paris", "Societe exemple", "intervention", "12:00", "13:00"));
        intervation_adapter adapter=new intervation_adapter(data);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        _List1= (ListView) _List1.findViewById(R.id.List1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        com.meriem.myapplicationexpert.ui.home.HomeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}