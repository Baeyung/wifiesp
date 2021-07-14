package com.machi.wifiesp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link del_and_set#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class del_and_set extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private List<String> mParam1;
    private int mParam2;
    Button del;
    TextView current;
    Button en;
    private static final String NAME = "server_list.txt";
    private static final String NAME1 = "current.txt";

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment del_and_set.
     */
    // TODO: Rename and change types and number of parameters
    public static del_and_set newInstance(ArrayList<String> param1, int param2) {
        del_and_set fragment = new del_and_set();
        Bundle args = new Bundle();
        args.putStringArrayList(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public del_and_set() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getStringArrayList(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_del_and_set, container, false);
        del = v.findViewById(R.id.delete);
        en = v.findViewById(R.id.textView4);
        current = v.findViewById(R.id.current);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mParam1.remove(mParam2);
                overWrite(mParam1);
                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                Toast.makeText(getContext(), "delete Successful", Toast.LENGTH_SHORT).show();
            }
        });
        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
                Toast.makeText(getContext(), "Set as default successful", Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            }
        });
        en.setText("set to default address");

        current.setText(mParam1.get(mParam2));

    }

    public void overWrite(List<String> mText) {
        for (int i = 0; i < mText.size(); i++) {
            String text1 = mText.get(i);
            text1 += "\n";
            FileOutputStream fos = null;
            try {
                fos = getActivity().openFileOutput(NAME, Context.MODE_PRIVATE);
                fos.write(text1.getBytes());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public void save() {
        String text1 = mParam1.get(mParam2);
        text1 += "\n";
        FileOutputStream fos = null;
        try {
            fos = getActivity().openFileOutput(NAME1, Context.MODE_PRIVATE);
            fos.write(text1.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}