package com.example;

import java.util.*;

public abstract class oiseau {
    private ArrayList<couleur> lCouleurs;
    private bec formeBec;
    private int longueurAile;

    public oiseau(ArrayList<couleur> lCouleurs, bec formeBec, int longueurAile) throws Exception{
        if(lCouleurs.size() == 0) throw new Exception("Un oiseau sans couleur ne peut pas être crée");
        this.lCouleurs = lCouleurs;
        this.formeBec = formeBec;
        this.longueurAile = longueurAile;
    }

    public oiseau(bec formeBec, int longueurAile){
        ArrayList<couleur> plumage = new ArrayList<couleur>();
        plumage.add(couleur.blanc);
        plumage.add(couleur.noir);
        this.lCouleurs = plumage;
        this.formeBec = formeBec;
        this.longueurAile = longueurAile;
    }

    public abstract String pondreOeuf();
    public abstract String faireNid();

    public ArrayList<couleur> getlCouleurs(){
        return this.lCouleurs;
    }

    public bec getBec(){
        return this.formeBec;
    }

    public int getLongueurAile(){
        return this.longueurAile;
    }

    public void setLongueurAile(int l){
        if(l > this.longueurAile){
            this.longueurAile = l;
        }
    }

    public String toString(){
        String tmp = "Couleur : ";
        for(int i = 0; i < this.lCouleurs.size(); i++){
            tmp += this.lCouleurs.get(i) + ", ";
        }
        return "Oiseau : " + tmp + ", formeBec : " + this.formeBec + ", LongueurAiles : " + this.longueurAile;
    }
}
