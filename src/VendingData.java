/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mark Anthony
 */
public class VendingData {
    
    private String pName;
    private int qty;
    private double price;
    
    public VendingData(){
    }
    
    VendingData(int qty,String pName,double price){
        this.pName=pName;
        this.qty=qty;
        this.price=price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public String getPname(){
        return pName;
    }
    
    public double getPrice(){
        return price;
    }
    
    
    
}
