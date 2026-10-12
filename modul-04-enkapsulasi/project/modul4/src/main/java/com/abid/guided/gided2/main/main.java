package com.abid.guided.gided2.main;

import com.abid.guided.gided2.hargapulsa.hargapulsa;
import com.abid.guided.gided2.hargatoken.hargatoken;

public class main {
    public static void main(String[] args) {

        hargatoken objectToken = new hargatoken();
        objectToken.info();
        
        hargapulsa objectPulsa = new hargapulsa();
        objectPulsa.info();
    }
}
