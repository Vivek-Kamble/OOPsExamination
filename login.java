package testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class login 
{
    
    int UserId;// user id ;
    int UserPassword;// password from the user given during registration
    int DbPassword;//to get password form database for particular user
    Scanner scan = new Scanner(System.in);
    
    public void login_input() throws ClassNotFoundException, SQLException
    {
        System.out.println("Enter The ID:");
        this.UserId =  scan.nextInt();
       
        
        System.out.println("Enter The Password");
        this.UserPassword= scan.nextInt();
        // connection between database
         //1.rgister drivers
            Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
            
            //2.Establish the connection
           //xampp
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamProject","root","root");
            
            PreparedStatement ps= con.prepareStatement("select StudentName,UserPassword from StudentDetails where StudentId=?");
            ps.setInt(1,UserId);
            ResultSet rs=ps.executeQuery();  
               while(rs.next())
               {  
                System.out.println(rs.getString(1)+rs.getInt(2));  //check for printing password
                   DbPassword=rs.getInt(2);
                   
                   
               }        
            
//                  
       if (UserPassword == DbPassword) // check the password from database
       {
           
           System.out.println("Please Enter the Stream:");   
           
           Testproject t = new Testproject();
          t.Input();
       //differeent func for logic to increment marks   
          // stream
          //switch
          //1 sci  database connet
          
          //2 com 
          //3 arts
          //
           
       }
       else
       {
           
           System.out.println("Invalid Password");
           
       }
    }
    public static void main(String[] args) 
    {
        login l= new login();
                try{
                    l.login_input();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                    System.out.println(e.getLocalizedMessage());
                }
    }
    
}