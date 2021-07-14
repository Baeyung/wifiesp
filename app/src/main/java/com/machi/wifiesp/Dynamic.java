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


public class Dynamic extends Fragment {
    Button fade;
    Button flash;
    Button strobe;
    Button smooth;
    String s;
    public Dynamic() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_dynamic, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        flash = view.findViewById(R.id.flash);
        fade = view.findViewById(R.id.fade);
        strobe = view.findViewById(R.id.strobe);
        smooth = view.findViewById(R.id.smooth);
        Wifi_Code wifiCode = new Wifi_Code();

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                s = wifiCode.wifiCode("16240687");
//                if(s == "failure"){
//                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
//                }
            }
        });
        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                s = wifiCode.wifiCode("16238647");
//                if(s == "failure"){
//                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
//                }
            }
        });
        smooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                s = wifiCode.wifiCode("16246807");
//                if(s == "failure"){
//                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
//                }
            }
        });
        strobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                s = wifiCode.wifiCode("16248847");
//                if(s == "failure"){
//                    Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
//                }
            }
        });

    }
}