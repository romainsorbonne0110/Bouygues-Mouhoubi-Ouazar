package com.example.romain.trombinoscope.DTO;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

    public class Personne {
        private String nom, prenom;
        private int couleur;

        public Personne(String nom, String prenom,int couleur){
            this.nom = nom;
            this.prenom = prenom;
           this.couleur = couleur;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public int getCouleur() {
            return couleur;
        }

       public void setCouleur(int couleur) {
            this.couleur = couleur;
        }

        @Override
        public String toString() {
            return "Personne{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", couleur=" + couleur +
                    '}';
        }
    }
