package com.example.romain.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

        Button btn_trombinoscope;
        Button btn_addP;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btn_trombinoscope = (Button) findViewById(R.id.btn_trombinoscope);
            btn_trombinoscope.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View view) {
                            Toast.makeText(MainActivity.this, "BIENVENUE AU TROMBINOSCOPE", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MainActivity.this, ListAddPersonne.class);
                            startActivity(intent);
                        }

                    }
            );
            btn_addP= (Button) findViewById(R.id.btn_addpersonredirect);
            btn_addP.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View view) {
                             Log.i(this.getClass().getName(), "ICI");
                             Intent activityChangeIntent = new Intent(MainActivity.this, AddPersonne.class);
                             startActivity(activityChangeIntent);
                        }
                    }
            );

        }

}

