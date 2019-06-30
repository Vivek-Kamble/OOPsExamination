/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopss_examination;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
public class UserDetails
{
    public UserDetails(String email) throws SQLException
    {
            //2.Establish the connection
          
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamProject","root","root");
            
             PreparedStatement ps= con.prepareStatement("select StudentId, StudentName ,Email ,UserPassword from StudentDetails where Email=? ");
             ps.setString(1,email);
             
             ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println("Your details are ----->>>>>\n");
                System.out.println("Student ID : "+rs.getInt(1)+"\nStudent Name : "+rs.getString(2)+"\nEmail: "+rs.getString(3)+"\nStudent Password : "+rs.getInt(4));
                System.out.println("Note down user id and password");
           }
    }
            
    }
