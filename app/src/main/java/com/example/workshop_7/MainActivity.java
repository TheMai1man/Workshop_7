package com.example.workshop_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button dial, thumbnail, contact, photo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dial = (Button) findViewById(R.id.dialAndMapButton);
        thumbnail = (Button) findViewById(R.id.thumbnailButton);
        contact = (Button) findViewById(R.id.contactButton);
        photo = (Button) findViewById(R.id.photoButton);


        dial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
        
    }
}