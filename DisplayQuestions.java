package oopss_examination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayQuestions {
    int point,StudentAnswer,UserId;
    String StudentStream;
    public DisplayQuestions(String stream,int UserId) throws ClassNotFoundException, SQLException
    {
        point=0;
        this.StudentStream=stream;
        this.UserId=UserId;
        
        //1.rgister drivers
            Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
            
            //2.Establish the connection         
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamProject","root","root");
            
            PreparedStatement DispQues= con.prepareStatement("Select Qno,Question,Option1,Option2,Option3,Option4,CorrectAnswer from "+this.StudentStream);
//            DispQues.setString(1,this.StudentStream);
            ResultSet rs=DispQues.executeQuery();
            while(rs.next())
            {
                System.out.println("\n\nQuestion Number  -->  "+rs.getInt(1));
                System.out.println("\n"+rs.getString(2));
                System.out.println("\n"+rs.getString(3));
                System.out.println("\n"+rs.getString(4));
                System.out.println("\n"+rs.getString(5));
                System.out.println("\n"+rs.getString(6));
                System.out.println("Enter your answer : ");
                Scanner sc = new Scanner(System.in);
                StudentAnswer=sc.nextInt();
                if(StudentAnswer==rs.getInt(7))
                {
                    System.out.println("Your answer is correct...");
                    point++;                    
                }
                else
                {
                    System.out.println("Your answer is wrong...");
                    System.out.println("Correct answer is : "+rs.getInt(7));
                }  
           }
           System.out.println("Your score is : "+point);
           
            PreparedStatement MarksUpdate= con.prepareStatement("update StudentDetails set Marks=? where StudentId=?");
           
           MarksUpdate.setInt(1,point);
           MarksUpdate.setInt(2,this.UserId);
           MarksUpdate.executeUpdate();
        
    }
//    public static void main(String[] args) {
//        try{
//            DisplayQuestions d = new DisplayQuestions("Science");
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        
//    }
    
}
