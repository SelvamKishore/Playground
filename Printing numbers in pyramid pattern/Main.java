#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j,k,num=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
  for(j=1;j<=n-i;j++)
  {
  printf(" ");
  }
   for(k=1;k<=i;k++)
   {
     printf("%d ",num);
   num+=1;  
  }
    printf("\n");
  }
	return 0;
}