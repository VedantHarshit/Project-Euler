public class Q7
{
    public boolean checkPrime(int number)
    {
        boolean status = true;
        for(int i = 2;i <= Math.sqrt(number);i++)
        {
            if(number % i == 0)
            {
                status = false;
                break;
            }
           
        }
        return status;
    }
    public static void main(String args[])
    {
        Q7 ob = new Q7();
        int serialNumber = 1;int saveNumber = 0;
        for(int i = 3;serialNumber<10001;i+=2)
        {
            if(ob.checkPrime(i))
            {
                serialNumber++;
                saveNumber = i;
            }  
        }
        System.out.println(saveNumber);
    }
}