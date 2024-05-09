package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exo1 = (Button) findViewById(R.id.exo1);
        exo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

            }
        });

        Button exo2 = (Button) findViewById(R.id.exo2);
        exo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);

            }
        });

        Button exo3 = (Button) findViewById(R.id.exo3);
        exo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);

            }
        });

        Button exo4 = (Button) findViewById(R.id.exo4);
        exo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(intent);

            }
        });

        Button exo5 = (Button) findViewById(R.id.exo5);
        exo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(intent);

            }
        });


    }

}


