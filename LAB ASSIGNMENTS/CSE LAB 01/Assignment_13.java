import java.util.Scanner;
public class Assignment_13
{
                 public static void main (String [ ]     args)
                 {
                 Scanner sc = new Scanner (System.in);
                 System.out.println("Please input the first number");
                 int a = sc.nextInt( );
     if (a%2==0)
      {
                   System.out.println("the number is even");
       }
    else
    {
                    System.out.println("The number is odd");
    }
    System.out.println("Please input the second number");
    int b = sc.nextInt( ); 
    if (b%2==0){
      System.out.println("the number is even");
    }
    else
    {
      System.out.println("The number is odd");
    }
    System.out.println("Please input  the third number");
    int c = sc.nextInt(); 
    if (c%2==0)
    {
      System.out.println("the number is even");
    }
    else{
      System.out.println("The number is odd");
    }
   
    System.out.println("Please input the fourth number");
  
    int d = sc.nextInt(); 
    
    if (d%2==0)
    {
      System.out.println("the number is even");
    }
    else
    {
      System.out.println("The number is odd");
    }
   
    System.out.println("Please input the fifth number");
    int e = sc.nextInt();
   if (e%2==0)
   {
      System.out.println("the number is even");
    }
    else
    {
      System.out.println("The number is odd");
   sc.close();
    }
  }
}