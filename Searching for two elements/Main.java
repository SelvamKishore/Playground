import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      int e1,e2,a=-1,b=-1;
       e1=s.nextInt();
       e2=s.nextInt();
      for(int i=0;i<n;i++)
      {
        if(arr[i]==e1)
          a=i;
        if(arr[i]==e2)
          b=i;
      }
      System.out.println(a);
       System.out.println(b);
    }
}