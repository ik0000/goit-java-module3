package com.goit.module3.flowers;


import java.util.ArrayList;
import java.util.List;

public class RoseBush {
    //int numOfRoses;
    //int numOfBranches;
    String color;

    List<Rose> roseInBush = new ArrayList<Rose>();

    public void roseBush(){
        for (Rose r  : roseInBush) {
            System.out.println(r.numOfBranches + " rose branches with " + r.numOfRoses + " flowers on the branch. Which means "+(r.numOfBranches*r.numOfRoses)+ " flowers in the Rose bush is in the bouquete either!");
        }
    }

}
