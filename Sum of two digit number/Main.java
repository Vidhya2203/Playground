import java.util.*;
import java.util.Scanner.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int num,sum;
      Scanner  sc=new Scanner(System.in);
      num=sc.nextInt();
      sum=(num%10)+(num/10);
      System.out.println(sum);
      
	}
}