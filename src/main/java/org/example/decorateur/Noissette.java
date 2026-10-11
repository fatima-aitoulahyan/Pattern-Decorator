package org.example.decorateur;

import org.example.composants.Boisson;

public class Noissette extends Decorateur {
    public Noissette(Boisson boisson){
        super(boisson);
    }
    @Override
    public String getDescription(){
        return boisson.getDescription() + " Noissette";
    }

    @Override
    public double cout() {
        return 0.9 + boisson.cout();
    }
}
