package oopss_examination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowResult {
    int UserId;
    public ShowResult(int UserId) throws ClassNotFoundException, SQLException
    {
        this.UserId=UserId;
        
         //1.rgister drivers
            Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
        
        
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamProject","root","root");
            
             PreparedStatement ps= con.prepareStatement("select StudentId, StudentName ,Email ,Marks from StudentDetails where StudentId=? ");
             ps.setInt(1,this.UserId);
             
             ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println("Your Result is ----->>>>>\n");
                System.out.println("Student ID : "+rs.getInt(1)+"\nStudent Name : "+rs.getString(2)+"\nEmail: "+rs.getString(3)+"\nStudent Marks : "+rs.getInt(4));                
            }
    } 
}
