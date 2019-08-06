public class Q12
{
    public int generateTriangularNumber(int t)
    {
        return(t*(t+1))/2;
    }
    
    public int getNumberOfDivisors(int number)
    {
        int count = 0;
        int t=(int)Math.sqrt(number);
        for(int i = 1;i < t;i++)
        {
            if(number % i == 0)
            count+=2;      
        }
        if(t*t==number)
            count++;
        return count;
    }
    
    public static void main(String args [])
    {
        Q12 ob = new Q12();
        int saveNumber = 0;
        for(int j =1;;j++)
        {
            if(ob.getNumberOfDivisors(ob.generateTriangularNumber(j)) > 500)
            {
                saveNumber = ob.generateTriangularNumber(j);
                break;
            }
        }
        System.out.println(saveNumber);
    }
}