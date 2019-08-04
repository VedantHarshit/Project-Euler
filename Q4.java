public class Q4
{
    public boolean checkPalindrome(int number)
    {
        int rev = 0,temp = number;
        while(temp!=0)
        {
            rev = (rev*10) + (temp%10);
            temp/=10;
        }
        if(rev == number)
        return true;
        else
        return false;
    }
    
    public void findGreatest()
    {
        int saveNumber = 0;
        for(int i =100;i <= 999;i++)
        {
            for(int j =100;j <= 999;j++)
            {
                if(checkPalindrome(i*j))
                   if((i*j)>saveNumber)
                    saveNumber = (i*j);
            }
        }
        System.out.println(saveNumber);
    }
    
    public static void main(String args[])
    {
        Q4 ob = new Q4();
        ob.findGreatest();
    }
}