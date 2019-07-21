#include <stdio.h>
int main() {
	// Type your code here
  int i,j,k,n,c;
  scanf("%d",&n);
  c=n*2-1;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
    if(j==i||(j==n-i+1))
    {
      printf("*");
    }
      else
        printf(" ");
    }
    printf("\n");
  }
	return 0;
}