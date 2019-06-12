package com.bokayo.jarso.lookup;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public  class MyAdapter extends RecyclerView.Adapter<MyAdapter.LookUpViewHolder> {
    private String[] dataSet = new String[]{};

    void setDataSet(String[] dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public MyAdapter.LookUpViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView textView = (TextView)
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.words,viewGroup,false);
        return new LookUpViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.LookUpViewHolder lookUpViewHolder, int i) {
        if (!dataSet[i].isEmpty()){
            lookUpViewHolder.textView.setText((i+1)+". "+dataSet[i]);}
    }

    @Override
    public int getItemCount() {
        return dataSet.length;
    }
    class LookUpViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        LookUpViewHolder(@NonNull TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }
}