package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

import static android.net.Uri.parse;

public class OpenWebsite extends AppCompatActivity {
    private static final String HTTPS = "https://";
    private static final String HTTP = "http://";
    //EditText url;
    Button browse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openwebsite);
        //url = (EditText)findViewById(R.id.editText3);
        browse=(Button)findViewById(R.id.button2);

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Url = "https://www.google.com";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Url)));

            }
        });
    }
}