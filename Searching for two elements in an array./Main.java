#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,t,t1,c=0;
  scanf("%d",&n);
  int a[n];
    
  for(i=0;i<=n-1;i++)
    scanf("%d",&a[i]);
  scanf("%d\n%d",&t,&t1);
  for(i=0;i<=n-1;i++)
  {
  if(a[i]==t)
    printf("%d\n",i);
  if(a[i]==t1)
     printf("%d\n",i);
    else
      c++;
    
  }
 if(c==n)
   printf("-1");
  return 0;
}