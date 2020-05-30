import java.util.Scanner;

public class Qusetion_01B
{
  
  
  public static void main(String[ ]   args)
  {  
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt(  );
      int i=sc.nextInt(  );
      int z=sc.nextInt(  );
      
      for(;z<7;z++)
       System.out.println("the value is"+(a+(i*z)));
   
       sc.close();
    
    
  }
  
  
}
