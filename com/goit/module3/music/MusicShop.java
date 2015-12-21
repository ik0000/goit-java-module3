package com.goit.module3.music;


import java.util.ArrayList;
import java.util.List;

public class MusicShop {

    List<MusicalInstrument> listOfInstuments = new ArrayList<MusicalInstrument>();

    public void listMusicalInstuments() {
        for (MusicalInstrument m : listOfInstuments) {
            System.out.println(m.instrumentName + " made by " + m.manufacturer + " only "+ m.value);
        }
    }

    public static void main(String[] args) {

        Guitar g1 = new Guitar();
        Trumpet t1 = new Trumpet();
        Piano p1 = new Piano();

        g1.instrumentName = "Guitar";
        g1.manufacturer = "Gibson";
        g1.value = "999$";

        t1.instrumentName = "Trumpet";
        t1.manufacturer = "Bach";
        t1.value = "499$";

        p1.instrumentName = "Piano";
        p1.manufacturer = "Schiedmayer";
        p1.value = "1499$";

        MusicShop m = new MusicShop();
        m.listOfInstuments.add(g1);
        m.listOfInstuments.add(p1);
        m.listOfInstuments.add(t1);
        m.listMusicalInstuments();

    }

}