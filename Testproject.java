/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vivek
 */
public class Testproject {
    int Student_id,Password;
    String name,email,stream;
    float marks;
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        this.name=sc.next();
        System.out.println("Enter Email address : ");
        this.email=sc.next();
        System.out.println("Enter your stream (Science,Commerce,Arts) : ");
        this.stream=sc.next();
        //this.Password=(int)(Math.random()*((9999-0)+1))+9999;
// this.Password=4545454;
        
         // It will generate 6 digit random Number.
    // from 0 to 999999
    Random rnd = new Random();//math function in java to generate math function
    this.Password=rnd.nextInt(999999);// object for random
//    this.Password=String.format("%06d", number);
    // this will convert any number sequence into 6 character.
//    System.out.println(String.format("%06d", number));//"%06d" ye vala google se 

        
       // System.out.println(name+email+stream);
    }

    public void JdbcInput() throws SQLException, ClassNotFoundException
    {
        
            //1.rgister drivers
            Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
            
            //2.Establish the connection
           //xampp
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamProject","root","root");
            
            PreparedStatement ps= con.prepareStatement("CALL inputDetails(?,?,?)");
            
            ps.setString(1,name);
            ps.setString(2,email);
//            ps.setString(3,stream);
            ps.setInt(3,Password);
//            ps.setString(1,"test");
//            ps.setString(2,"test");
//            ps.setString(3,"test2");
//            ps.setInt(4,123);
            
//            ps.executeUpdate();
//
//                ps.setString(1,"aaf");
//            ps.setString(2,"safasf");
//            ps.setString(3,"sfaasf");
//            ps.setInt(4,898);
//         
//         
            int status=ps.executeUpdate();
            System.out.println(status);
            if(status>0)
            {
                System.out.println("successfully updated");
            }
            else
           {
                System.out.println("Someting error");
            }
            
            con.close();            
        
    }
    
    
    public static void main(String[] args) {
         Testproject t= new Testproject();
         t.Input();
         try{
             t.JdbcInput();
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
    }
}
