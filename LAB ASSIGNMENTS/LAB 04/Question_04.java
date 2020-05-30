
public class Question_04 {
  
  
  public static void main(String[ ]   args) 
  {    
        int sum=0;
        int n=1;
        
        for(n=1;n<=600;n++)
        {
          if(n%7==0)
          {
              if(n%9!=0)
              {
            
                sum=sum+n;
              }
          }
          else if(n%9==0)
          {
            sum=sum+n;
          }
          
          
        }
    System.out.println("the sum is "+sum);
  }
  
  
  
}
