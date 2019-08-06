public class Q21
{
    public int d(int n)
    {
        int sum = 0;
        for(int i = 1;i < n;i++)
        {
            if(n % i == 0)
            sum += i;
        }
        return sum;
    }
    
    public void sumAmicable()
    {
        long sumOfAmicableNumbers = 0;
        for(int i = 1;i < 10000;i++)
        {
            if(d(d(i)) == i && i != d(i))
            sumOfAmicableNumbers += d(d(i));
        }
        System.out.println(sumOfAmicableNumbers);
    }
    
    public static void main(String args [])
    {
        Q21 ob = new Q21();
        ob.sumAmicable();
    }
}