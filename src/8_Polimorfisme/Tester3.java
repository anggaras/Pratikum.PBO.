/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classpolimorfisme2;

/**
 *
 * @author Agata
 */
public class Tester3 {
    public static void main(String[] args) {
        PermanenEmployee pEmp = new PermanenEmployee("DIDIK", 500);
        InternshipEmployee iEmp = new InternshipEmployee("SUNARTO", 5);
        ElectricityBill eBill = new ElectricityBill(5,"A-1");
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
    }
}
