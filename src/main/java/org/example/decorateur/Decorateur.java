package org.example.decorateur;

import org.example.composants.Boisson;

public abstract class Decorateur extends Boisson {
    protected Boisson boisson;
    public Decorateur(Boisson boisson){
        this.boisson=boisson;
    }
}
