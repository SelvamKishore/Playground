import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s1=new Scanner(System.in);
      int n=s1.nextInt();
      int s=(n%10)+(n/10)/10;
      System.out.println(s);
	}
}