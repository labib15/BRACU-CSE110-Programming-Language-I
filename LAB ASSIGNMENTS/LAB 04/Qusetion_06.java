import java.util.Scanner;

public class Qusetion_06
{
  
  
  public static void main(String [ ]  args)
  {  System.out.println("please input your quantity, q");
     Scanner sc=new Scanner(System.in);
     int q=sc.nextInt();
    
    int c=1;
   
    for(int n;c<=q;c++) 
    {  System.out.println("please enter your number,n");
        n=sc.nextInt();
        
        if(n%2==0)
        {
          System.out.println("the number you entered is even");
        }
          else
          {
            System.out.println("the number you entered is odd");
          }
            
        
      
    }
 sc.close();
  }
}
