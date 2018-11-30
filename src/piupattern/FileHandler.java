/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piupattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class FileHandler {
    
    public ArrayList<Chart> ReadFile(String arquivo, String channel) {
        String name ="";
        String chart ="";
        ArrayList<Chart> niveis = new ArrayList<>();
        ArrayList<String> song;
        try (FileReader fr = new FileReader(new File(arquivo)); BufferedReader buff = new BufferedReader(fr)) {
            String linha = buff.readLine();            
            while (linha != null) {     
                if(linha.contains("#TITLE")){
                    name = linha.replaceAll("#TITLE|;", "");                    
                }
                
                if(linha.contains("-----")){
                   
                    song = new ArrayList<String>();
                    linha = buff.readLine();   
                    boolean notes = false;
                    while(linha!=null&& !notes){                        
                        if(linha.contains("#CHARTNAME")){
                            chart = linha.replaceAll("#CHARTNAME||;", "");
                        }
                        if(linha.contains("#NOTES")) notes = true;
                        linha = buff.readLine();
                    }
                    while(linha!=null&&(linha.matches("[0-9]{5}|,"))){                            
                             if(!linha.contains(",")){
                             song.add(linha);
                         }
                         linha= buff.readLine();
                    }
                    if(song.size()>0){
                        Chart charts = new Chart(name, chart, channel, song);
                        niveis.add(charts);
                    }
                    linha = buff.readLine();
                }
                
                linha = buff.readLine();
            }
            
        } catch (IOException ex) {
            System.out.println("Não foi possível ler o arquivo");
        }
       return niveis;
    }
    
}
