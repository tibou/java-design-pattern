package com.example.singleton;

public class Singleton {
    private static Singleton instance;
    private int compteur = 0;


    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public void increment(){
        this.compteur++;
    }

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
