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
public class Chart {
    
    private String name;
    private String chartName;  
    private String channel;
    private ArrayList<String>song;

    public Chart(String name, String chartName, String channel, ArrayList<String> song) {
        this.name = name;
        this.chartName = chartName;
        this.channel = channel;
        this.song = song;
       
    }

    public ArrayList<String> getSong() {
        return song;
    }
    

    public String getName() {
        return name;
    }

    public String getChartName() {
        return chartName;
    }

    public String getChannel() {
        return channel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }   
    
}
