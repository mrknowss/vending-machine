package Vending;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mark Anthony
 */
public class VendingData {
    
    private String item_num;
    private String product_name;
    private String qty;
    private double price;
   
    
    public VendingData(){
    }
    
    VendingData(String item_num,String product_name,String qty,double price ){
       this.item_num=item_num;
       this.product_name=product_name;
       this.qty=qty;
       this.price=price;
       
    }
    
    public String getItemNum(){
        return item_num;
 
    }
    
    public String getQty(){
        return qty;
    }
    
    public String getPname(){
        return product_name;
    }
    
    public double getPrice(){
       
        return price;
    }
    
    
    
    
}
