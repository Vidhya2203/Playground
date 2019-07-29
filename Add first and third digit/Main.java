import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int num,first,last,sum;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      first=num/100;
      last=num%10;
      sum=first+last;
      System.out.println(sum);
      
	}
}