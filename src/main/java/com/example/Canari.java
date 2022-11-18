package com.example;

import java.util.*;

public class Canari extends oiseau implements Volant, Siffleur{

    private int surface;
    private int nbOiseaux = 1;

    public Canari(ArrayList<couleur> lCouleurs, bec formeBec, int longueurAile, int surface, int nbOiseaux) throws Exception{
        super(lCouleurs, formeBec, longueurAile);
        this.surface = surface;
        this.nbOiseaux += nbOiseaux;
    }

    public Canari(ArrayList<couleur> lCouleurs, bec formeBec, int longueurAile) throws Exception{
        super(lCouleurs, formeBec, longueurAile);
        this.surface = 1;
        this.nbOiseaux += 1;
    }

    public String pondreOeuf(){
        return "un canari pond un oeuf";
    }

    public String faireNid(){
        return "un canari fait un nid dans la mare";
    }

    public String voler(){
        return "un canari vole";
    }

    public String siffler(){
        return "un canari siffle";
    }
}