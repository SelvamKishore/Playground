#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,t;
  scanf("%d",&n);
  t=((n+1)*(n+2))/2;
  int a[n];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(i=0;i<n;i++)
  t-=a[i];
  printf("%d",t);
  
  return 0;
}