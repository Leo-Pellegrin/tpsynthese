package com.example;

import java.util.*;


public class Colibri extends oiseau implements Volant, Siffleur{

    public Colibri(ArrayList<couleur> lCouleurs, bec formeBec, int longueurAile) throws Exception{
        super(lCouleurs, formeBec, longueurAile);
    }

    public String pondreOeuf(){
        return "un colibri pond un oeuf";
    }

    public String faireNid(){
        return "un colibri fait son nid dans un arbre";
    }

    public String voler(){
        return "un colibri vole";
    }

    public String siffler(){
        return "un colibri siffle";
    }
}
