import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here 
    int num,first,sec,last,rev;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    first=num/100;
    sec=(num%100)/10;
    last=num%10;
    rev=(last*100)+(sec*10)+first;
    System.out.println(rev);
    
  }
}