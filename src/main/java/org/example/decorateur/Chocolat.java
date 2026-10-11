package org.example.decorateur;

import org.example.composants.Boisson;

public class Chocolat extends Decorateur {
    public Chocolat(Boisson boisson){
        super(boisson);
    }
    @Override
    public String getDescription(){
        return boisson.getDescription() + " chocolat";
    }

    @Override
    public double cout() {
        return 0.5 + boisson.cout();
    }
}
