#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c,i,j;
  scanf("%d %d",&r,&c);
  int a[r][c],b[r][c],s[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d ",&a[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d ",&b[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      s[i][j]=a[i][j]-b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      printf("%d ",s[i][j]);
    }
    printf("\n");
  }
	return 0;
}