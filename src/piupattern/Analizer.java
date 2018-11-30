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
public class Analizer {
    
        
    public ArrayList<Chart> escadinha(ArrayList<Chart> musicas){
        ArrayList<Chart> result = new ArrayList<>();
        for (int i = 0; i < musicas.size(); i++) {
            Chart chart = musicas.get(i);
            ArrayList<String> song = chart.getSong();
            boolean escada = false;
            int cont = 0;
            for (int j = 0; j < song.size(); j++) {
                String aux = song.get(j);
                if(aux.charAt(cont) != '0'){
                    escada= true;
                    cont++;
                }
                else{
                    escada = false;
                    cont = 0;
                }
                if(cont==5 && escada){
                    result.add(chart);
                    break;
                }
            }
        }
        
        return result.size()>0? result : null;
    }
    
    
}
