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
                s = wifiCode.wifiCode("16212127");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        dblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16208047");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        dpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16206007");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16216207");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16214167");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16228447");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16224367");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        sblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16232527");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        dsblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16222327");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        navyblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16230487");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16195807");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16191727");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16199887");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        lorange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16189687");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = wifiCode.wifiCode("16197847");
                if(s == "failure"){
                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}