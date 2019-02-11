package com.example.romain.trombinoscope.Data;
import com.example.romain.trombinoscope.DTO.Personne;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;


public class DataPersonne {
        public static List<Personne> personnes = new ArrayList<Personne>() {
            {
                add(new Personne("mou", "fatima", Color.BLACK));
            }

        };

}


