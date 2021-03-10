import java.util.*;
import java.io.*;
public class Calculator {
    public static void main (String args[]) throws IOException{
        double a,b,c;
        int choice;
        boolean check=true;
        while(check){
            try{
                System.out.println("Press 1:Addition, 2:Subtraction, 3:Multiplication, 4:Division, 5:Exit");
                System.out.print("Enter your choice:");
                Scanner sc=new Scanner(System.in);
                choice=sc.nextInt();
                switch (choice){
                    case 1: System.out.print("Enter two numbers with space:");
                        a= sc.nextDouble();
                        b= sc.nextDouble();
                        c=a+b;
                        System.out.println("Answer is: "+c);
                        break;

                    case 2: System.out.print("Enter two numbers with space:");
                        a= sc.nextDouble();
                        b= sc.nextDouble();
                        c=a-b;
                        System.out.println("Answer is: "+ c);
                        break;
                    case 3: System.out.print("Enter two numbers with space:");
                        a= sc.nextDouble();
                        b= sc.nextDouble();
                        c=a*b;
                        System.out.println("Answer is: "+ c);
                        break;
                    case 4: System.out.print("Enter two numbers with space:");
                        a= sc.nextDouble();
                        b= sc.nextDouble();
                        if(b==0) {
                            System.out.println("Invalid division: Division with 0)");
                            break;
                        }
                        c=a/b;
                        System.out.println("Answer is: "+ c);
                        break;
                    case 5: System.out.println("Thank you for using Calculator");
                        check=false;
                        break;
                    default: System.out.println("Wrong Choice,enter a valid number");

                }
            }
            catch (Exception inp){
                System.out.println("Error: "+inp );
            }
        }

    }
}