#include<stdio.h>
int main()
{
  //Type your code here
  int  i,j,n,m,c=1;
  scanf("%d %d",&n,&m);
  int a[n][m];
  for(i=0;i<n;i++)
  {
	for(j=0;j<m;j++)
   	{
      scanf("%d ",&a[i][j]);
    }
  }
  int s;
  scanf("%d",&s);
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(s==a[i][j])
      {
        printf("(%d, %d)",i,j);
        c=0;
        break;
      }
    }
  }
  if(c==1)
  {   printf("(-1, -1)");}
  return 0;
}