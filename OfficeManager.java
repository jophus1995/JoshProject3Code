/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3gui;

import static project3gui.ProcessCommands.IDS;
import java.util.ArrayList;


/**
 *
 * @author KinkyKat
 */
public class OfficeManager extends Login {
    public String username;
    public String password;
    public String fName;
    public String lName;
    public String email;
    ArrayList<Login> invoices = new ArrayList<>();
    public OfficeManager(String fName, String lName, String email, String username, String password, String userType) {
        super(username, password);
    }
    
        public String examineByPartName(String name) {
        for (int i = 0; i < IDS.size(); i++) {
            if (IDS.get(i).getName().equals(name)) {
                return IDS.get(i).getName() + " " + IDS.get(i).getRightPrice();
            }
        }
        return "part not found";
    }    
    
    public String examineByPartNum(int partNum) {
        for (int i = 0; i < IDS.size(); i++) {
            if (IDS.get(i).getNum() == (partNum)) {
                return IDS.get(i).getName() + " " + IDS.get(i).getRightPrice();
            }
        }
        return "part not found";
    }
    
    public String checkParts(ArrayList<BikePart> IDS){
        String c = "";
        for(int i = 0; i < IDS.size(); i ++) {
            if(IDS.get(i).getQuantity() < 5) {
              return IDS.get(i).toString();
    }
        }
        return "Parts to be ordered";
    }
  }
