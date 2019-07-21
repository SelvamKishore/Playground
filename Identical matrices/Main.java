#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c,i,j;
  scanf("%d %d",&r,&c);
  int a[r][c],b[r][c];
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
      scanf("%d",&b[i][j]);
    }
  }
  int flag=0;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(a[i][j]==b[i][j])
        flag=0;
      else
        flag=1;
    }
  }
  if(flag==0)
    printf("Yes");
  else
    printf("No");
	return 0;
}