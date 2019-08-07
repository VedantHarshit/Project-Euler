public class Q10
{
  public boolean checkPrime(long number)
    {
        boolean status = true;
        for(int i = 3;i<=Math.sqrt(number);i+=2)
        {
            if(number % i == 0)
            {
                status = false;
                break;
            }
           
        }
        return status;
    }
  
  public void sum()
  {
      long sum = 2;
      long i = 3;
      while(i < 2000000)
      {
          if(checkPrime(i))
          {
              sum += i; 
          }
          i += 2;
      }
      System.out.println(sum);
  }
  public static void main(String args[])
  {
      Q10 ob = new Q10();
      ob.sum();
  }
}
