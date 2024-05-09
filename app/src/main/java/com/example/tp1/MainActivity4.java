package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button goback = (Button) findViewById(R.id.back);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        EditText a = (EditText) findViewById(R.id.a);
        EditText b = (EditText) findViewById(R.id.b);
        EditText c = (EditText) findViewById(R.id.c);
        Button resoudre = (Button) findViewById(R.id.resoudre);
        Button reinitialiser = (Button) findViewById(R.id.reinitialiser);
        TextView resultat = (TextView) findViewById(R.id.result);

        reinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("");
                b.setText("");
                c.setText("");
            }
        });

        resoudre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String avalue = a.getText().toString();
                Double adoubleValue = Double.parseDouble(avalue);
                String bvalue = b.getText().toString();
                Double bdoubleValue = Double.parseDouble(bvalue);
                String cvalue = c.getText().toString();
                Double cdoubleValue = Double.parseDouble(cvalue);

                Double delta,solution1,solution2;


                delta = Math.pow(bdoubleValue,2) - 4 *  adoubleValue * cdoubleValue;

                if (delta > 0){
                    solution1 =  (-bdoubleValue -Math.sqrt(delta))/(2 * adoubleValue);
                    solution2 =  (-bdoubleValue +Math.sqrt(delta))/(2 * adoubleValue);


                }

            }
        });



    }
}