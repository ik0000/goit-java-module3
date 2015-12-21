package com.goit.module3.flowers;


import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    List<Flower> flowersInBouquet = new ArrayList<Flower>();

    public void showBouquet() {
        for (Flower f : flowersInBouquet) {
            System.out.println(f.flowerColour +" " + f.flowerName + " is in the bouquet!");
        }
    }

    public static void main(String[] args) {
        Aster a1 = new Aster();
        a1.flowerColour = "Pink";
        a1.flowerName = "Aster";

        Tulip t1 = new Tulip();
        t1.flowerColour = "Yellow";
        t1.flowerName = "Tulip";

        Camomile c1 = new Camomile();
        c1.flowerColour = "White";
        c1.flowerName = "Camomile";

        Rose r1 = new Rose();
        r1.flowerColour = "Red";
        r1.flowerName = "Rose";

        Bouquet b1 = new Bouquet();
        b1.flowersInBouquet.add(a1);
        b1.flowersInBouquet.add(t1);
        b1.flowersInBouquet.add(c1);
        b1.flowersInBouquet.add(r1);

        RoseBush rb1 = new RoseBush();
        rb1.color = "red";
        rb1.numOfRoses = 3;
        rb1.numOfBranches = 1;

        Rose rose = new Rose();
        rose.roseInBush.add(rb1);

        b1.showBouquet();
        rose.roseBush();



    }
}