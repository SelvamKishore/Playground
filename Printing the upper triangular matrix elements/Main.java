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
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i==j)
      printf("%d ",a[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i+1==j)
        printf("%d ",a[i][j]); 
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i+2==j)
        printf("%d ",a[i][j]);
    }
  }
	return 0;
}