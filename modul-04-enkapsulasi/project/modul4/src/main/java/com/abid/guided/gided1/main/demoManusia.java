package com.abid.guided.gided1.main;

import com.abid.guided.gided1.Manusia.Manusia;

public class demoManusia {
    public static void main(String[] args) {
        Manusia arrMns[] = new Manusia[3];

        // constructor
        Manusia objMns1 = new Manusia();
        Manusia objMns2 = new Manusia("joy");
        Manusia objMns3 = new Manusia("jooo", 88);

        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for (int i = 0; i < 3; i++) {
            System.out.println("nama: " + arrMns[i].getNama());
            System.out.println("umur: " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}