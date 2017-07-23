/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ashraf_k
 */
public abstract class Customer {
    protected String name;
    protected String hpNo;
    
    public Customer (String n, String hp){
        name = n;
        hpNo = hp;
    }

    public String getName() {
        return name;
    }

    public String getHpNo() {
        return hpNo;
    }
}
