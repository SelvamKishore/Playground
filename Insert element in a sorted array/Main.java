#include<stdio.h>
int main()
{
 //Type your code here
  int n,i;
  scanf("%d",&n);
  int a[n+1];
  for(i=0;i<n+1;i++)
  {
    scanf("%d",&a[i]);
  }
  int ins,j;
  scanf("%d",&ins);
  a[n+1]=ins;
 for(i=0;i<n+1;i++)
  {
    for(j=i+1;j<n+1;j++)
    {
      if(a[i]>a[j])
      {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
  }
   for(i=0;i<n+1;i++)
  {
    printf("%d ",a[i]);
  }
  return 0;
}