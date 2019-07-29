import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here 
      int num,sec_num;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      sec_num=(num%100)/10;
      System.out.println(sec_num);
	}
}