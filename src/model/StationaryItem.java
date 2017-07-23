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
public final class StationaryItem {
    //4 marks for data member declarations
    private String itemName;
    private double itemPrice;
    private final int itemQuantity;
    private double totalPrice;
    
    public StationaryItem(String itName, int iQtty){ 
        setItemName(itName);
        setPrice(itName);
        itemQuantity = iQtty;
        totalPrice = calculateTotalPrice();
    }
    
    public String getItemName() {
        return itemName;
    }
    
    private void setItemName(String itName) {
        
        switch (itName){
            case "pen": 
                itemName = "Pen";
                break;
            case "pencil": 
                itemName = "Pencil";
                break;
            case "eraser": 
                itemName = "Eraser";
                break;
        }
    }
    
    private void setPrice(String itName) {
        switch (itName){
        case "pen": 
            itemPrice = 1.00; 
            break;
        case "pencil": 
            itemPrice = 0.80; 
            break;
        case "eraser": 
            itemPrice = 0.50; 
            break;
        }
    }
    
    public int getItemQuantity() {
        return itemQuantity;
    }
    
    public double getItemPrice() {
        return itemPrice;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public double calculateTotalPrice(){
        totalPrice = itemPrice * itemQuantity;
        return totalPrice;
    }
}
