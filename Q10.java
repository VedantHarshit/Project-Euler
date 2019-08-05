public class Q10
{
  public boolean checkPrime(int number)
    {
        boolean status = true;
        for(int i = 2;i<=Math.sqrt(number);i++)
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
      long sum = 0;
      int i=1;
      while(i<2000000)
      {
          if(checkPrime(i))
          {
          sum+=i;
          i++;
        }
      }
      System.out.println(sum);
  }
  public static void main(String args[])
  {
      Q10 ob = new Q10();
      ob.sum();
  }
}
