public class Question_11
{
    public static void main(String[ ]args)
    {
        for(int n=40;n<=50;n++){
            int c= 0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==2)
                System.out.println(n+"is a prime number");
            else
                System.out.println(n+" is not a prime number");
        }
    }
}
