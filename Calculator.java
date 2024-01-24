import java.util.*;
public class calculator
{
  public static void main(String[] args)
  {
    System.out.println("enter first value");
    Scanner sc= new Scanner(System.in);
    int num1= sc.nextInt();
    System.out.println("enter the 2nd value");
    int num2= sc.nextInt();
    System.out.print("ADD:-");
    int add=num1+num2;
    int sub=num1-num2;
     int mul=num1*num2;
     int div=num1/num2;
     
    System.out.println(add);
     System.out.println(sub);
      System.out.println(mul);
      System.out.println(div);
    
    }
    }


