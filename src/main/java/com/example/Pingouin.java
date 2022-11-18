package com.example;

import java.util.*;

public class Pingouin extends oiseau {
    
    public Pingouin(ArrayList<couleur> lCouleurs, bec formeBec, int longueurAile) throws Exception{
        super(lCouleurs, formeBec, longueurAile);
    }

    public Pingouin(bec formeBec, int longueurAile){
        super(formeBec, longueurAile);
    }

    public String pondreOeuf(){
        return "un pingouin pond un œuf";
    }

    public String faireNid(){
        return "un pingouin construit son nid sur la banquise";
    }
}
