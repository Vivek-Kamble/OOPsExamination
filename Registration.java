
package oopss_examination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class Registration  {
    int Student_id,Password;
    String name,email,stream;
    float marks;
    public Registration()
    {
        this.Student_id=0;
        this.name="";
        this.email="";
        this.stream="";
        this.marks=0.00f;
        this.Password=0;
        System.out.println("Welcome to Examination Portal ... ");
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        this.name=sc.next();
        System.out.println("Enter Email address : ");
        this.email=sc.next();
//    System.out.println("Enter your stream (Science,Commerce,Arts) : ");
//    this.stream=sc.next();
//this.Password=(int)(Math.random()*((9999-0)+1))+9999;
// this.Password=4545454;
        
         // It will generate 6 digit random Number.
    // from 0 to 999999
    Random rnd = new Random();//math function in java to generate math function
    this.Password=rnd.nextInt(999999);// object for random

        
       // System.out.println(name+email+stream);
    }
    public void JdbcInput() throws SQLException, ClassNotFoundException
    {
        
            //1.rgister drivers
            Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
            
            //2.Establish the connection
          
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamProject","root","root");
            
                   //Sql query for upadating user input into table using store procedure
                        PreparedStatement ps= con.prepareStatement("CALL inputDetails(?,?,?)");
                        //passing values to query
                        ps.setString(1,name);
                        ps.setString(2,email);
                        ps.setInt(3,Password);
                        ps.executeUpdate();
                       //user details
                       UserDetails u= new UserDetails(email);
//                         login l= new login();
//                try{
//                    l.login_input();
//                }
//                catch(Exception e)
//                {
//                    System.out.println(e.getMessage());
//                    System.out.println(e.getLocalizedMessage());
//                }
                       
            
            // 
          
       
   con.close();            
        
    }
//    public static void main(String[] args) {
//        Registration r = new Registration();
//        r.Input();
//        try{
//            r.JdbcInput();
//            System.out.println("Registration Successful...");
//        }
//        catch(Exception e)
//        {   
//            System.out.println("Email already registered");
//            System.out.println("Please try another Email address...");
//            //System.out.println(e.getMessage());
//        }
//        
////        System.out.println(r.Password);//print check for random password
//    }
}
