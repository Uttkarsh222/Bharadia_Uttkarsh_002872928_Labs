/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class VitalSignHistory {
    private ArrayList<Createvital> history;
    public VitalSignHistory(){
        this.history = new ArrayList<Createvital>();
        
    }

    public ArrayList<Createvital> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Createvital> history) {
        this.history = history;
    }
    public Createvital addNewVital(){
        Createvital newVitals = new Createvital();
        history.add(newVitals);
        return newVitals;
        
    }
    public void deleteVitals(Createvital vs){
        history.remove(vs);
    }
}
