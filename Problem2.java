public class Problem2
{
  public static void main(String[] args)
  {
    int val = 867;
    int num1 = (val % 10); 
    val /= 10;
    int num2 = (val % 10);
    val /= 10; 
    int num3 = (val % 10); 
    System.out.println(num3);
    System.out.println(num2);
    System.out.println(num1);
  }
}
