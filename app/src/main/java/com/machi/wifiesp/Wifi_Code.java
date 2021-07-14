package com.machi.wifiesp;

import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class Wifi_Code{
    String s;
    public Wifi_Code() {

    }
    public String wifiCode(String red, String blue, String green){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://ahmadserver.ddns.net:88/?r"+red+"g"+green+"b"+blue+"&", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody) {
                //Toast.makeText(MainActivity.this, "successful", Toast.LENGTH_SHORT).show();
                s = "Successful";
            }

            @Override
            public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, Throwable error) {
                // Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                s = "failure";
            }
        });
        return s;
    }
    
}
