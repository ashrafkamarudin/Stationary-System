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
public class NonMemberCustomer extends Customer {

    public NonMemberCustomer(String n, String hp) {
        super(n, hp);
    }
    
    @Override
    public String toString() {
        return "\nCustomer Name : " + name + "\nCustomer Phone Number : " + hpNo;
    }
}
