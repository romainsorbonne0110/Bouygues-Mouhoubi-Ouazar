package com.example.romain.trombinoscope;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import com.example.romain.trombinoscope.DTO.Personne;
import com.example.romain.trombinoscope.Data.DataPersonne;

public  class AddPersonne extends AppCompatActivity {

    private static final String TAG = "AddPersonne";
    Button btnSubmit;
    EditText nom, prenom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_personne);
        Log.i(this.getClass().getName(), "ICI");

        final Button btnSubmit = (Button)findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String prenom = ((EditText)findViewById(R.id.prenom)).getText().toString();
                    String nom = ((EditText)findViewById(R.id.prenom)).getText().toString();
                    Personne p  =new Personne(prenom, nom, Color.BLACK);
                    DataPersonne.personnes.add(p);
                    Toast.makeText(getApplicationContext(),"ajouté! :"+ p, Toast.LENGTH_LONG).show();
                }
            });
        }

    }