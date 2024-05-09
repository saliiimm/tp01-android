package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button goback = (Button) findViewById(R.id.back);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        EditText verb = (EditText) findViewById(R.id.verbe);
        Button conjuger = (Button) findViewById(R.id.conjuger);
        TextView resultatc = (TextView) findViewById(R.id.resultatc);
        AlertDialog.Builder  builder = new AlertDialog.Builder(this);
        conjuger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verbeValue = verb.getText().toString();


                if (verbeValue.substring(0,verbeValue.length() - 2) == "er" || !verbeValue.equals("aller")){
                    resultatc.setText("Je " + verbeValue.substring(0,verbeValue.length() - 1) + "\n" +
                                      "Tu " + verbeValue.substring(0,verbeValue.length() - 1) + "s\n" +
                                       "Il/Elle/On " +  verbeValue.substring(0,verbeValue.length() - 1) + "\n" +
                                       "Nous "+ verbeValue.substring(0,verbeValue.length() - 2) + "ons\n" +
                                       "Vous " +  verbeValue.substring(0,verbeValue.length() - 2) + "ez\n" +
                                        "Ils/Elles " +  verbeValue.substring(0,verbeValue.length() - 2) + "ent\n");
                }
                else {
                    builder.setMessage("Votre verbe n'est pas du 1er groupe")
                            .setCancelable(false)
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                            Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setNegativeButton("Fermer", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    //  Action for 'NO' Button
                                    dialog.cancel();
                                    Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                            Toast.LENGTH_SHORT).show();
                                }
                            });
                    //Creating dialog box
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.setTitle("Erreur");
                    alert.show();
                }
            }
        });

    }
}