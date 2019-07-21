#include <stdio.h>
int main(){
	// Type your code here
  int i,j,n,n1=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      n1=n1+1;
      if(n1%2==1)
      {
        printf("*");
      }
      else if(n1%2==0)
      {
        printf("#");
      }
    }
    printf("\n");
  }
  	return 0;
}