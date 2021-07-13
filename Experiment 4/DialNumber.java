package com.example.app4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class DialNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Binding MainActivity.java with 
        // activity_main.xml file
        setContentView(R.layout.dialnumber);

    }

    // This function is called when button is clicked.
    public  void Call(View v)
    {
        // Find the EditText by its unique ID
        EditText e = (EditText)findViewById(R.id.phoneNumber);

        // show() method display the toast with message 
        // "clicked"
        Toast.makeText(this, "clicked", Toast.LENGTH_LONG)
                .show();

        // Use format with "tel:" and phoneNumber created is 
        // stored in u.
        Uri u = Uri.parse("tel:" + e.getText().toString());

        // Create the intent and set the data for the 
        // intent as the phone number.
        Intent i = new Intent(Intent.ACTION_DIAL, u);

        try
        {
            // Launch the Phone app's dialer with a phone 
            // number to dial a call.
            startActivity(i);
        }
        catch (SecurityException s)
        {
            // show() method display the toast with 
            // exception message.
            Toast.makeText(DialNumber.this, "An error occurred", Toast.LENGTH_LONG)
                    .show();
        }
    }
}