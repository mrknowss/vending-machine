package Vending;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;

import java.sql.SQLException;




/**
 *
 * @author Mark Anthony
 */


public class DatabaseConn {
    
    public static Connection mycon(){
        Connection con=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vendingmachine1","root","");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e);
        }
        return con;
            
        }  
        }
         
    
    
   
  
    

