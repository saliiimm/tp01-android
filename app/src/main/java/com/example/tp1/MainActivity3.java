package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button convertir = (Button) findViewById(R.id.convertir);
        EditText valeur = (EditText) findViewById(R.id.valeur);
        RadioButton EuroDinar = (RadioButton) findViewById(R.id.euroDinar);
        RadioButton DinarEuro = (RadioButton) findViewById(R.id.dinarEuro);
        TextView conversion = (TextView) findViewById(R.id.conversion);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringvalue = valeur.getText().toString();
                Double doubleValue = Double.parseDouble(stringvalue);
                Double newvalue;
            if (EuroDinar.isChecked()){
                 newvalue = doubleValue * 139.07;
                 conversion.setText(String.valueOf(newvalue));
            }else if (DinarEuro.isChecked()){
                newvalue = doubleValue * 0.0072;
                conversion.setText(String.valueOf(newvalue));
            }


            }
        });
    }
}