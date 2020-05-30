public class Question_01D
{
 public static void main (String[ ]   args)
 {
  int n=9;
  int i=2;
  for(i=2;n*i<=63;i++)
  {
   if(i%2==0){
    System.out.println(n*i);
   }
   else{
    System.out.println(n*i*-1);
 
   }
  
  }

 }

}