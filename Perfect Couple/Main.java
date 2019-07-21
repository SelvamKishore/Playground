import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n,i,j;
      n=s.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int f=s.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(a[i] + a[j] ==f)
            System.out.println(a[i] +", " +a[j]);
        }
       // System.out.println();
      }
    }
}