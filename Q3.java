public class Q3
{
    public static void main(String args[])
    {
       long number = 600851475143l;
       for(int i = 3;i <= number/2;i+=2) 
       {
           if(number % i == 0)
           {
               number/=i;
               i-=2;
           }
       }
       System.out.println(number);
    }
}
