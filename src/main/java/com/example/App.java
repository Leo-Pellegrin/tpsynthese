package com.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<couleur> plumage = new ArrayList<couleur>();

        oiseau titi = new Cigogne(bec.cisaille, 70);
        System.out.println(titi.toString());

        // try{
        //     oiseau gerard = new Cigogne(bec.spatule, 30, plumage);
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage()); 
        // }
    }
}

/* Question 2 :
    On ne peut pas écrire cette déclaration car le constructeur de oiseau a besoin de parametre

    Question 3 :
    On pourrait écrire cette ligne si les paramètres du constructeur appelé n'était pas vide

    Question 4 :
    On ne peut toujours pas écrire cette déclaration car aucun constructeur ne correspond

    Question 7 :
    On ne peut pas ajouter un attribut dans une interface car il ne pourrait pas être utiliser comme aucune des méthodes ne doit être défini
*/