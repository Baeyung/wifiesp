package com.machi.wifiesp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class adapter extends RecyclerView.Adapter<adapter.viewholder> {

    private List<String> s1;
    private int size;
    private OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public adapter(List<String> s){
        s1 = s;
    }



    public class viewholder extends RecyclerView.ViewHolder{

        TextView t1;

        public viewholder(View itemView,final OnItemClickListener listener)
        {
            super (itemView);
            t1 = itemView.findViewById(R.id.textView_RV);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }


    @Override
    public viewholder onCreateViewHolder(ViewGroup parent,int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerview,parent,false);
        return new viewholder(view,mListener);
    }

    @Override
    public void onBindViewHolder(viewholder holder,int position){
        TextView textView = holder.t1;
        textView.setText(s1.get(position));
    }

    @Override
    public int getItemCount() {
        size = s1.size();
        return size;
    }
}
