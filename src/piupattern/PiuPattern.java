/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piupattern;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class PiuPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileHandler fl = new FileHandler();
        ArrayList<Chart> musicaa = fl.ReadFile("1556 - Number Nine - T-ARA.ssc", "prime2");
        Analizer ana = new Analizer();
        System.out.println(ana.escadinha(musicaa).size());
        System.out.println("ok");
    }
    
}
