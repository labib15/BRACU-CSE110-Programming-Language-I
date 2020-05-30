import java.util.Scanner;

public class Question_07
{
  
  
  public static void main(String[ ]    args) 
  { 
    Scanner sc=new Scanner(System.in);
  System.out.println("please enter the quantity,q");
  
   int q=sc.nextInt();
   int max=Integer.MIN_VALUE;
   int min=Integer.MAX_VALUE;
   
   int sum=0;
   int c=1;
   
   
   System.out.println("please enter your interger,n");
 
   
   for(;c<=q;c++)
   {  
     int n=sc.nextInt();
     sum=sum+n;
   
   if(n>max)
   {
     max=n;
   }
   
     if(n<min) 
     {
       min=n;
     }

  
  
  
   
   }

  int avg=(sum)/q;
  
  System.out.println("the min value of the input is "+min);
  System.out.println("the max value of the input is "+max);
  System.out.println("the average value of the input is "+avg); 
 sc.close();
  }
  
}