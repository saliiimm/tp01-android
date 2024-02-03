package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        Button buttonplus = (Button) findViewById(R.id.plus);
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText op1 = (EditText) findViewById(R.id.op1);
                EditText op2 = (EditText) findViewById(R.id.op2);
                TextView resultat = (TextView) findViewById(R.id.resultat);
                String input1 = op1.getText().toString();
                int val1 = Integer.parseInt(input1);
                String input2 = op2.getText().toString();
                int val2 = Integer.parseInt(input2);
                int result = val1 + val2;
                resultat.setText(String.valueOf(result));
            }
        });
        Button buttonmoins = (Button) findViewById(R.id.minus);
        buttonmoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText op1 = (EditText) findViewById(R.id.op1);
                EditText op2 = (EditText) findViewById(R.id.op2);
                TextView resultat = (TextView) findViewById(R.id.resultat);
                String input1 = op1.getText().toString();
                int val1 = Integer.parseInt(input1);
                String input2 = op2.getText().toString();
                int val2 = Integer.parseInt(input2);
                int result = val1 - val2;
                resultat.setText(String.valueOf(result));
            }
        });
        Button buttonfois = (Button) findViewById(R.id.times);
        buttonfois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText op1 = (EditText) findViewById(R.id.op1);
                EditText op2 = (EditText) findViewById(R.id.op2);
                TextView resultat = (TextView) findViewById(R.id.resultat);
                String input1 = op1.getText().toString();
                int val1 = Integer.parseInt(input1);
                String input2 = op2.getText().toString();
                int val2 = Integer.parseInt(input2);
                int result = val1 * val2;
                resultat.setText(String.valueOf(result));
            }
        });
        Button buttondivision = (Button) findViewById(R.id.divided);
        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText op1 = (EditText) findViewById(R.id.op1);
                EditText op2 = (EditText) findViewById(R.id.op2);
                TextView resultat = (TextView) findViewById(R.id.resultat);
                String input1 = op1.getText().toString();
                int val1 = Integer.parseInt(input1);
                String input2 = op2.getText().toString();
                int val2 = Integer.parseInt(input2);
                int result = val1 / val2;
                resultat.setText(String.valueOf(result));
            }
        });
    }

}


