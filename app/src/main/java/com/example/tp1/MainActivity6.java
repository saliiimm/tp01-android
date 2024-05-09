package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button exit = (Button) findViewById(R.id.Exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button init = (Button) findViewById(R.id.Initialize);
        EditText prixunitaire = (EditText) findViewById(R.id.prixunitaire);
        EditText quantity = (EditText) findViewById(R.id.quantity);

        init.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prixunitaire.setText("");
                quantity.setText("");

            }
        });

        Button calculate = (Button) findViewById(R.id.calculate);
        RadioGroup group1 = (RadioGroup)findViewById(R.id.group1);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double prixu = Double.parseDouble(prixunitaire.getText().toString());
                Double q = Double.parseDouble(quantity.getText().toString());
                Double r1 = prixu * q;
                RadioButton group1_checked = (RadioButton) findViewById(group1.getCheckedRadioButtonId()) ;
                Integer val1 = Integer.parseInt(group1_checked.getText().toString().substring(0,group1_checked.getText().toString().length() - 1));

                Double r2 = r1 + val1 * r1;


                EditText res1 = (EditText) findViewById(R.id.r1);
                EditText res2 = (EditText) findViewById(R.id.r2);

                res1.setText("" + r1 );
                res2.setText("" + r2 );


            }
        });


    }
}