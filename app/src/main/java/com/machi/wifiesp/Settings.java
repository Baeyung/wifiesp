package com.machi.wifiesp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Settings extends Fragment {


    private static final String NAME = "server_list.txt";
    private List<String> text = new ArrayList<>();
    private EditText editText;
    private Button b1;
    private RecyclerView recyclerView;
    private adapter adapter;


    public Settings() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v1= inflater.inflate(R.layout.fragment_settings, container, false);
        editText = v1.findViewById(R.id.editText);
        b1 = v1.findViewById(R.id.done);
        recyclerView = v1.findViewById(R.id.recyclerView);
        adapter = new adapter(load());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(v1.getContext()));
        recyclerView.setAdapter(adapter);

        return v1;

    }

    public void save() {
        String text1 = editText.getText().toString();
        text1+="\n";
        FileOutputStream fos = null;
        try {
            fos = getActivity().openFileOutput(NAME, Context.MODE_APPEND);
            fos.write(text1.getBytes());
            text.add(text1);
            adapter.notifyItemInserted(text.size());
            editText.getText().clear();
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




    public List<String> load() {
        FileInputStream fis = null;

        try {
            fis = getActivity().openFileInput(NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text1;
            while ((text1 = br.readLine()) != null) {
                sb.append(text1);
                text.add(text1);
            }
            return text;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return text;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
        adapter.setOnItemClickListener(new adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
//                text.remove(position);
//                adapter.notifyItemRemoved(position);
//                overWrite(text);
                FragmentManager fragmentManager = getParentFragmentManager();
                ArrayList<String> text1 = new ArrayList<>(text.size());
                text1.addAll(text);
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,del_and_set.newInstance(text1,position))
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });
    }
}
