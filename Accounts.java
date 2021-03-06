/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3gui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import project3gui.Login;
import static project3gui.SysAdmin.accounts;

/**
 *
 * @author KinkyKat
 */
// will have the ablility to determine if a login is a warehouse manager, sales associate, system admin, and office manager
public class Accounts {

    public static void validate(String userName, String password) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName) && accounts.get(i).getPassword().equals(password)) {
                accounts.get(i);
            }
        }
    }

    public static Login userValidate(String userName) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName)) {
                Login l = accounts.get(i);
                return l;
            }
        }
        return null;
    }
    //Add instanceof in controller 

    /**
     * @param filename
     * @param accounts
     */
    public static void writeLoginFile(String filename, ArrayList<Login> accounts) {
        try {
            File file = new File(filename);
            FileWriter fw = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fw);
            for (Login l : accounts) {
                System.out.println(l.toStringLogin());
                writer.println(l.toStringLogin()); // uses Login toStringLogin()
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("file error!");
            e.printStackTrace();
        }
    }

    public static ArrayList<Login> readLoginFile(String fileName) {
        SysAdmin.accounts = null;
        if (fileName == null || fileName.equals("")) {
            return SysAdmin.accounts;
        }
        File file = new File(fileName);
        try {
            SysAdmin.accounts = new ArrayList<>();
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String regExp = ",";
                String[] pv = line.split(regExp);
                Login l = new Login(pv[0], pv[1], pv[2], pv[3], pv[4],pv[5]);
                SysAdmin.accounts.add(l);
            }
        } catch (FileNotFoundException e) {
            return null;
        }
        return SysAdmin.accounts;
    }
}

