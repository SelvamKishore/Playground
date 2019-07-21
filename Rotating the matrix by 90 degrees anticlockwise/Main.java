#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c,i,j;
  scanf("%d %d",&r,&c);
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<r/2;i++)
  {
    for(j=i;j<r-i-1;j++)
    {
      int t=a[i][j];
      	a[i][j]	=a[j][r-i-1];
       a[j][r-1-i] =a[r-1-i][r-1-j]; 
 		a[r-1-i][r-1-j] =a[r-1-j][i];
        a[r-1-j][i] =t;
     
    }
    
  }
    for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      printf("%d ",a[i][j]);
    }
      printf("\n");
  }
	return 0;
}