/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3gui;

import static project3gui.ProcessCommands.read;
import static project3gui.ProcessCommands.readFile;
import static project3gui.ProcessCommands.total;
import static project3gui.ProcessCommands.writeFile;
import java.util.ArrayList;

/**
 *
 * @author KinkyKat
 */
public class SysAdmin extends Login {

    public static ArrayList<Login> accounts = new ArrayList<>();


    public SysAdmin(String fName, String lName, String email, String username, String password,String userType) {
        super(username, password);
    }

    public static void addOfficeManager(String fName, String lName, String email, String username, String password, String userType) {
        OfficeManager o = new OfficeManager(fName, lName, email, username, password,userType);
        accounts.add(o);
    }

    public static void addWHManager(String fName, String lName, String email, String username, String password,String userType) {
        WHManager w = new WHManager(fName,lName,email,username,password,userType);
        accounts.add(w);
    }

    public static void addSalesAssociate(String fName, String lName, String email, String username, String password,String userType) {
        SalesAssociate a = new SalesAssociate(fName, lName, email, username, password,userType);
        accounts.add(a);
    }

    public static void deleteAccount(String username) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(username)) {
                accounts.remove(i);
            }
        }
    }

    public static void addSalesVan(String filename) {
        ArrayList<BikePart> blank = new ArrayList<>();
        total = read(blank, total);
        writeFile(filename, blank);
        blank = readFile(filename);
        total = read(blank, total);

    }
}
