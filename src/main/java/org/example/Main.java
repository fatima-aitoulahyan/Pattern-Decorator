package org.example;

import org.example.composants.Boisson;
import org.example.composants.Deca;
import org.example.decorateur.Caramel;
import org.example.decorateur.Chocolat;
import org.example.decorateur.Decorateur;
import org.example.decorateur.Noissette;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         Boisson boisson;
         boisson=new Deca();
         System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
         System.out.println("***********************");
         boisson = new Chocolat(boisson);
         System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
         System.out.println("***********************");
         boisson = new Caramel(boisson);
         System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
         System.out.println("***********************");
         boisson = new Noissette(boisson);
         System.out.println(boisson.getDescription());
         System.out.println(boisson.cout());
         System.out.println("***********************");
     }

}
