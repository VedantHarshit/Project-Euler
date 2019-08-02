public class Q1
{
  public void display()
  {
      int sum = 0;
      for(int i=1;i<1000;i++)
      {
       if(i%3==0||i%5==0)
       sum+=i;
      }
      System.out.println(sum);
  }
  public static void main(String args[])
  {
      Q1 ob = new Q1();
      ob.display();
  }
}
