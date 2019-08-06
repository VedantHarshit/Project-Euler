public class Q3
{
    public static void main(String args[])
    {
       long number = 600851475143l;
       for(int i = 2;i <= number/2;i++) 
       {
           if(number % i == 0)
           {
               number/=i;
               i--;
           }
       }
       System.out.println(number);
    }
}
