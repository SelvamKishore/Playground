import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here\
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
        if(a[i]!=0)
          System.out.print(a[i]+" ");
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
          System.out.print(a[i]+" ");
      }
    }
}