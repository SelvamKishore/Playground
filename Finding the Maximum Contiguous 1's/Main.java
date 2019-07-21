#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,c=0;
  scanf("%d", &n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  	if(a[i]==1)
      c++;
  }
  printf("%d",c-1);
    
  return 0;
}