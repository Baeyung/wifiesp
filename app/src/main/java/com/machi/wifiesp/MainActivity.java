package com.machi.wifiesp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.InputStream;

import cz.msebera.android.httpclient.entity.mime.Header;

public class MainActivity extends AppCompatActivity {


    private Wifi_Code wifiCode = new Wifi_Code();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentContainerView2,ColorWheel.class,null)
                .setReorderingAllowed(true)
                .commit();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch(item.getItemId()){
            case R.id.item1:
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, Settings.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
                return true;
            case R.id.item2:
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, Static.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
                return true;
            case R.id.item3:
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, Dynamic.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
                return true;
            case R.id.item4:
                wifiCode.wifiCode("16236607");
                return true;
            case R.id.item5:
                wifiCode.wifiCode("16203967");
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    @Override
    public void onBackPressed() {
        int stackCount = getSupportFragmentManager().getBackStackEntryCount();
        if (stackCount == 1) {
            super.onBackPressed(); // if you don't have any fragments in your backstack yet.
        } else {
            // just replace container with fragment as you normally do;

            FragmentManager fm = getSupportFragmentManager();
            fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.fragmentContainerView2, new ColorWheel());
            transaction.commit();
        }
    }

}