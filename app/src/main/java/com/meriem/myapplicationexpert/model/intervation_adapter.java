package com.meriem.myapplicationexpert.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.meriem.myapplicationexpert.R;

import java.util.List;

public class intervation_adapter extends RecyclerView.Adapter <intervation_adapter.MyViewHolder> {
    List<Intervention> data ;

    public intervation_adapter(List<Intervention> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lsv_element,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(data.get(position).getSociety(),data.get(position).getAddress(),data.get(position).getDatedebut()+"-"+data.get(position).getDatefin(),data.get(position).getTitre());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nomIntervention, address , nomSociete , heuredebut,heurefin;
        CheckBox checkBox1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomIntervention = itemView.findViewById(R.id.nomIntervention);
            nomSociete = itemView.findViewById(R.id.nomSociete);
            address = itemView.findViewById(R.id.address);
            heuredebut= itemView.findViewById(R.id.heuredebut);
            heurefin= itemView.findViewById(R.id.heurefin);
            checkBox1= itemView.findViewById(R.id.checkBox1);



        }
        public void bind (String societe ,String address,String time , String titre ){
            this.nomIntervention.setText(titre);
            this.nomSociete.setText(societe);
            this.address.setText(address);
            this.heuredebut.setText(time);
            this.heurefin.setText(time);


        }
    }
}
