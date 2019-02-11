package com.example.romain.trombinoscope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.romain.trombinoscope.Adapter.PersonneAdapter;
import com.example.romain.trombinoscope.DTO.Personne;
import com.example.romain.trombinoscope.Data.DataPersonne;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
public class ListAddPersonne extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private ListView mListView;
    private ArrayList<Personne> selectedPersons = new ArrayList<Personne>();
    private ArrayList<View> selectedChilds = new ArrayList<View>();

    Button btn_del;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        mListView = (ListView) findViewById(R.id.list_view);
        PersonneAdapter adapter = new PersonneAdapter(this, DataPersonne.personnes);
        mListView.setAdapter(adapter);
    }
}