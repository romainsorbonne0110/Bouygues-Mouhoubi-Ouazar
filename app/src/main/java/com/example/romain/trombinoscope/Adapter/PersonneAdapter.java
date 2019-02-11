package com.example.romain.trombinoscope.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.romain.trombinoscope.DTO.Personne;
import com.example.romain.trombinoscope.R;
import com.example.romain.trombinoscope.holder.PersonneItemholder;

public class PersonneAdapter extends ArrayAdapter<Personne> {
    public PersonneAdapter(Context context, List<Personne> persons) {
        super(context, 0, persons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_personne, parent, false);
        }
        Personne person = getItem(position);
        PersonneItemholder viewHolder = (PersonneItemholder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new PersonneItemholder();
            viewHolder.firstName = (TextView) convertView.findViewById(R.id.nomShow);
            viewHolder.lastName = (TextView) convertView.findViewById(R.id.prenomShow);
            viewHolder.avatar = (ImageView) convertView.findViewById(R.id.imageShow);
            convertView.setTag(viewHolder);
        }

        viewHolder.firstName.setText(person.getNom());
        viewHolder.lastName.setText(person.getPrenom());
        viewHolder.avatar.setImageDrawable(new ColorDrawable(person.getCouleur()));

        return convertView;
    }
}

