package com.machi.wifiesp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button on = (Button) findViewById(R.id.button2);
        Button off =(Button) findViewById(R.id.button);
        Button neg = (Button) findViewById(R.id.button4);
        Button pos = (Button) findViewById(R.id.button5);
        Button w =(Button) findViewById(R.id.button6);
        Button b = (Button) findViewById(R.id.button7);
        Button g = (Button) findViewById(R.id.button8);
        Button r =(Button) findViewById(R.id.button9);
        Button f = (Button) findViewById(R.id.button10);
        Button lb = (Button) findViewById(R.id.button11);
        Button lg =(Button) findViewById(R.id.button12);
        Button lr = (Button) findViewById(R.id.button13);
        Button s = (Button) findViewById(R.id.button14);
        Button p =(Button) findViewById(R.id.button15);
        Button sb = (Button) findViewById(R.id.button16);
        Button o = (Button) findViewById(R.id.button17);
        Button fa =(Button) findViewById(R.id.button18);
        Button lp = (Button) findViewById(R.id.button19);
        Button nb = (Button) findViewById(R.id.button20);
        Button lo =(Button) findViewById(R.id.button21);
        Button sm = (Button) findViewById(R.id.button22);
        Button pi = (Button) findViewById(R.id.button23);
        Button db =(Button) findViewById(R.id.button24);
        Button y = (Button) findViewById(R.id.button25);


        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16236607");
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16203967");
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16214167");
            }
        });
        neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16220287");
            }
        });
        pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16187647");
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16244767");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16212127");
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16228447");
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16195807");
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16240687");
            }
        });
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16224367");
            }
        });
        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16208047");
            }
        });
        lr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16191727");
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16248847");
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16216207");
            }
        });
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16232527");
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16199887");
            }
        });
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16238647");
            }
        });
        lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16206007");
            }
        });
        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16230487");
            }
        });
        lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16189687");
            }
        });
        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16246807");
            }
        });
        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16230487");
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createreq("16197847");
            }
        });
    }

    void createreq(String x){
        Wifi_Code wifi_code = new Wifi_Code();
        wifi_code.wifiCode(x);
    }

}