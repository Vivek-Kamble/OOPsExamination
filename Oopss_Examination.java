
package oopss_examination;

import java.util.Scanner;

public class Oopss_Examination 
{

    public static void main(String[] args)
    {
        int choice;
        int StudentId;
        System.out.println("1.Registration");
        System.out.println("2.Login");
        System.out.println("3.Display Result");
        System.out.println("4.Exit");
        
        Scanner sc = new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:Registration r = new Registration();
                    r.Input();
                    try{
                        r.JdbcInput();
                        System.out.println("Registration Successful...");
                        login l= new login();
                        l.login_input();
                    
                    }
                    catch(Exception e)
                    {   
                        System.out.println("Email already registered");
                        System.out.println("Please try another Email address...");
                        //System.out.println(e.getMessage());
                    }
                    break;
            case 2:login l= new login();
                    try{
                        l.login_input();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                        System.out.println(e.getLocalizedMessage());
                    }
                    break;
            case 3:
                System.out.println("Enter StudentId : ");
                StudentId=sc.nextInt();
                try{

                    ShowResult s = new ShowResult(StudentId);
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:System.exit(1);
                
        }
    }
    
}
