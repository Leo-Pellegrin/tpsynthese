package com.example;

import java.util.*;

public class Cigogne extends oiseau implements Volant{
    
    public Cigogne(bec formeBec, int longueurAile, ArrayList<couleur> lCouleurs) throws Exception{
       super(lCouleurs, formeBec, longueurAile);
    }

    public Cigogne(bec formeBec, int longueurAile){
        super(formeBec, longueurAile);
    }

    public String pondreOeuf(){
        return "une cigogne pond un œuf";
    }

    public String faireNid(){
        return "une cigogne fait son nid sur un clocher";
    }

    public String voler(){
        return "une cigogne vole";
    }
}
