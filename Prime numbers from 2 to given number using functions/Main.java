import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner s=new Scanner (System.in);
      int n=s.nextInt();
      int i,j,c;
      if(n>=2)
      {
        System.out.println("2");
      }
    	for(i=3;i<=n;i++)
        {
          c=0;
          for(j=2;j<=i-1;j++)
          {
			if(i%j==0)
            {
              c++;
              break;
            }
          }
          if(c==0)
          
             System.out.println(i);
             
            }
          }
          
         // if(c==0 )
          ///  System.out.println(i);
        
          }

    
    
	