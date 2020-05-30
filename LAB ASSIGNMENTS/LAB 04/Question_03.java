
public class Question_03 {
  
  
  public static void main(String[ ]    args)
  { 
    
     int sum=0;
     int n;
   for(n=1;n<=600;n++)
   {
     if(n%7==0)
     {
       sum=sum+n;
      
     }
     else
     {
       if(n%5==0)
       {
         sum=sum+n;
       }
     }
   
   
   
   }
    System.out.println("the sum of all the numbers is  "+sum);
    
    
    
    
    
    
    
  }
    
}
