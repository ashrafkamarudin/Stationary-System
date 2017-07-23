/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ashraf_k
 */
public class Receipt {
    private MemberCustomer mCust;
    private NonMemberCustomer nmCust;
    private final ArrayList<StationaryItem>ItemList;

    private double discount;
    int i = 1;
    private final String receiptID;
    private final LocalDate receiptDate;
    
    public Receipt(NonMemberCustomer customer)
    {
        ItemList = new ArrayList<>();
        receiptID = "00" + i++;
        receiptDate = LocalDate.now();
        nmCust = customer;
        discount = 0;
    }
    
    public Receipt(MemberCustomer customer)
    {
        ItemList = new ArrayList<>();
        receiptID = "00" + i++;
        receiptDate = LocalDate.now();
        mCust = customer;
        discount = 0.05;
    }
    
    public void addItems(StationaryItem Si){
        ItemList.add(Si);
    }
    
    public void clearItems() {
        ItemList.clear();
    }
    
    public ArrayList<String> displayStationaryItems(){
        ArrayList<String> items = new ArrayList<>();
        for(i=0;i<ItemList.size();i++) {
            if (ItemList.get(i).getItemQuantity() != 0 ) {
                items.add(ItemList.get(i).getItemName()+ "/" + ItemList.get(i).getItemQuantity()+ "/RM"
                + ItemList.get(i).getItemPrice()+ "/RM"
                + ItemList.get(i).getTotalPrice());
            }
        }
        return items;
    }
    
    public void displayBasicInformation() {
        System.out.println("STATIONARY ITEMS RECEIPT"); System.out.println(" Kedai Dobi Kita");
        System.out.println("Taman Seri Indah, Kuantan");
    }
    
    public double calculateSubTotal(){
        double total = 0;
        
        for (i=0;i<ItemList.size();i++){
            total = total + ItemList.get(i).calculateTotalPrice(); 
        }
        return total;
    }
    
    public double calculateGST() {
        double gst;
        return gst = this.calculateSubTotal()* 0.06;
    }
    
    public double calculateDiscount() {
        return (this.calculateGST() + this.calculateSubTotal()) * discount;
    }
    
    public double calculateTotal(){
        double total;
        return total = this.calculateGST() + this.calculateSubTotal() - this.calculateDiscount();
    }
}
