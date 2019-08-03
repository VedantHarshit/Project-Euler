public class Q2
{
  public void display()
  {
      int a = 1,b = 2,sum = 2,c;
      do
      {
          c = a + b;
          sum+=c%2==0?c:0;
          a = b;
          b = c;
      }while(c<=4000000);
      System.out.println(sum);
  }
  public static void main(String args[])
  {
      Q2 ob = new Q2();
      ob.display();
  }
}
