package com.machi.wifiesp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
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

import com.google.android.material.navigation.NavigationView;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.InputStream;

import cz.msebera.android.httpclient.entity.mime.Header;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    private Wifi_Code wifiCode = new Wifi_Code();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if(savedInstanceState == null){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentContainerView2,ColorWheel.class,null)
                .setReorderingAllowed(true)
                .commit();
        }
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
            case R.id.item4:
                wifiCode.wifiCode("255","255","255");
                return true;
            case R.id.item5:
                wifiCode.wifiCode("0","0","0");
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch(item.getItemId()){
            case R.id.nav_Color_wheel:
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, ColorWheel.class, null)
                        .setReorderingAllowed(true)
                        .commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.nav_Static:
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, Static.class, null)
                        .setReorderingAllowed(true)
                        .commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.nav_Dynamic:
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2, Dynamic.class, null)
                        .setReorderingAllowed(true)
                        .commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.nav_share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "link to Google Play";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Check this App");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.nav_send:
                Intent Email = new Intent(Intent.ACTION_SEND);
                Email.setType("text/email");
                Email.putExtra(Intent.EXTRA_EMAIL, new String[] { "ahmadsheikh617@gnail.com" });
                Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                Email.putExtra(Intent.EXTRA_TEXT, "Dear Dev," + "\n");
                startActivity(Intent.createChooser(Email, "Send Feedback:"));
                drawer.closeDrawer(GravityCompat.START);
                return true;
            default:
                return true;

        }
    }
}