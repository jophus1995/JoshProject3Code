/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KinkyKat
 */
public class SalesAssociate extends Login {
    
    public SalesAssociate(String fName, String lName, String email, String username, String password,String userType) {
        super(username, password);
    }
    public static ArrayList<BikePart> showPartsReadFile(String fileName) {
        ArrayList<BikePart> retList = null;
        if (fileName == null || fileName.equals("")) {
            return retList;
        }
        File file = new File(fileName);
        try {
            retList = new ArrayList<>();
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String regExp = ",";
                String[] pv = line.split(regExp);
                BikePart bp = new BikePart(pv[0],
                        Integer.parseInt(pv[1]),
                        Double.parseDouble(pv[2]),
                        Double.parseDouble(pv[3]),
                        Boolean.parseBoolean(pv[4]),
                        Integer.parseInt(pv[5]));
                retList.add(bp);
            }
        } catch (FileNotFoundException e) {
            return null;
        }
        return retList;
    }
    
    
}
