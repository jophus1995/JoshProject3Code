/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3gui;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KinkyKat
 */
// Gonna have a sales associate and few other fields i think
public class Invoice {

    String customer;
    Date d;
    String empRecieved;
    BikePart b;
    double totCost;
    String salesAssociate;
    public static ArrayList<BikePart> bps = new ArrayList<>();
    String test;

    public Invoice(String customer, Date d, String emRecieved, BikePart b, String salesAssociate, String test) {
        this.customer = customer;
        this.d = d;
        this.empRecieved = empRecieved;
        this.b = b;
        totCost = getTotalCost(b);
        this.salesAssociate = salesAssociate;
        this.test = test;
    }

    Invoice(String customer, Date d, String empRecieved, BikePart b, String salesAssociate) {
        this.customer = customer;
        this.d = d;
        this.empRecieved = empRecieved;
        this.b = b;
        totCost = getTotalCost(b);
        this.salesAssociate = salesAssociate;
    }

    public String getD() {
        return test;
    }

    public String getCustomer() {
        return customer;
    }

    public Date getDate() {
        return d;
    }

    public String getEmpRecieved() {
        return empRecieved;
    }

    public BikePart getPart() {
        return b;
    }

    public double getTotCost() {
        return totCost;
    }

    public String getSA() {
        return salesAssociate;
    }

    public BikePart getBP() {
        return b;
    }

    public double getTotalCost(BikePart b) {
        double totalCost = 0.0;
        return totalCost = b.getQuantity() * b.getRightPrice();
    }

    //public String toString() {
    //    return /*customer + " " + d + "," + "fix" + "," + / b + ", "/ + salesAssociate + "," */;
    //}
}