import java.util.*;
class Comparee
{
  public static void main(String args[])
  {
    Scanner a = new Scanner(System.in);
    int n,i,fact=1;
    n = a.nextInt();
    if(n==0)
    {
      System.out.println(1);
    }
    else if(n>0)
    {
      for(i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
    }
    else
    {
      System.out.println("enter above 0");
    }
  }
}
   
