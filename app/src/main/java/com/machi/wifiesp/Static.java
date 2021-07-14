package com.machi.wifiesp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Static extends Fragment {


    private Button blue;
    private Button dblue;
    private Button lpurple;
    private Button dpurple;
    private Button pink;
    private Button green;
    private Button lgreen;
    private Button sblue;
    private Button dsblue;
    private Button navyblue;
    private Button red;
    private Button lred;
    private Button orange;
    private Button lorange;
    private Button yellow;
    String s;
    Wifi_Code wifiCode=new Wifi_Code();

    public Static() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_static, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        blue = view.findViewById(R.id.blue);
        dblue = view.findViewById(R.id.dblue);
        lpurple = view.findViewById(R.id.lpurple);
        dpurple = view.findViewById(R.id.dpurple);
        pink = view.findViewById(R.id.pink);
        green = view.findViewById(R.id.green);
        lgreen = view.findViewById(R.id.lgreen);
        sblue = view.findViewById(R.id.sblue);
        dsblue = view.findViewById(R.id.dsblue);
        navyblue = view.findViewById(R.id.navyb);
        red = view.findViewById(R.id.red);
        lred = view.findViewById(R.id.lred);
        orange = view.findViewById(R.id.orange);
        lorange = view.findViewById(R.id.lorange);
        yellow = view.findViewById(R.id.yellow);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 201724;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        dblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 197628;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        dpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 2098172;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 11338748;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 16516076;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 261131;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 261148;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        sblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 261360;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        dsblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 234748;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        navyblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 131676;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 16717056;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 16734538;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 16736517;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lorange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 16545835;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = 16440576;
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = (color) & 0xFF;
                s = wifiCode.wifiCode(Integer.toString(red),Integer.toString(blue),Integer.toString(green));
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}