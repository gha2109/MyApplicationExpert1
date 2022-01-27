package com.meriem.myapplicationexpert.ui.InterventionDetail;

import androidx.fragment.app.FragmentTransaction;
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

import com.google.android.gms.maps.model.ButtCap;
import com.meriem.myapplicationexpert.LocalisationUtilisateur;
import com.meriem.myapplicationexpert.R;
import com.meriem.myapplicationexpert.TabFragment;

public class interventionDetailFragment extends Fragment {

    private InterventionDetailViewModel mViewModel;

    public static interventionDetailFragment newInstance() {
        return new interventionDetailFragment();
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.intervention_detail_fragment, container, false);
        Button carte =(Button) view.findViewById(R.id.carte);
        carte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), LocalisationUtilisateur.class);
                startActivity(in);
            }
        });
Button Historique=(Button) view.findViewById(R.id.Historique);

Historique.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentTransaction fr=getFragmentManager().beginTransaction();
        fr.replace(R.id.fragment_container_view_tag,new TabFragment());
        fr.commit();
    }
});




        return view;

}



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InterventionDetailViewModel.class);
        // TODO: Use the ViewModel
    }

}