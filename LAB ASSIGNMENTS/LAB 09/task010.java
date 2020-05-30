/*Try to use printf () for all variable types you know  */


import java.util.Scanner;

public class task010{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
   
    System.out.println("please input your integer"); 
    int n=sc.nextInt(); 
    System.out.println("your integer is "+n);
    System.err.printf("your integer is %d\n ",n);
    System.out.println();
   
    System.out.println("please input your float");
   float f=sc.nextFloat();
   System.out.println("your float is "+f);
   System.err.printf("your float is %f\n ",f);
   System.out.println();
   
   /*System.out.println("please input your double");
   double d=sc.nextDouble();
   System.out.println("your double is "+d);
   System.err.printf("your double is %lf\n ",d); */
   
  
   System.out.println("please input your character ");
   char c = sc.next().charAt(0);
   System.out.println("your character is "+c);
   System.err.printf("your character is %c\n ",c);
   System.out.println();
   
   System.out.println("please input your String");
   String s=sc.nextLine();
   System.out.println("your String is "+s);
   System.err.printf("your String is %s\n ",s);
   
  sc.close();  
  }
}