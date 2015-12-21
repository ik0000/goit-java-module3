package com.goit.module3.flowers;


import java.util.ArrayList;
import java.util.List;

public class Rose extends Flower{

    List<RoseBush> roseInBush = new ArrayList<RoseBush>();

      public void roseBush(){
            for (RoseBush r  : roseInBush) {
                System.out.println(r.numOfBranches + " rose branches and " + r.numOfRoses + " flowers on the branch. Which means "+(r.numOfBranches*r.numOfRoses)+ " flowers in the Rose bush is there either!");
            }
        }

    public static void main(String[] args) {


        RoseBush rb1 = new RoseBush();
        rb1.color = "red";
        rb1.numOfRoses = 3;
        rb1.numOfBranches = 1;

        Rose rose = new Rose();
        rose.roseInBush.add(rb1);
        rose.roseBush();

    }
}
