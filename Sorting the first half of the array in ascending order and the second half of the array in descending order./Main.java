#include<stdio.h>
int main()
{
	//Try out your code here
  int n,i,j,t;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(i=0;i<n/2;i++)
  {
    for(j=i+1;j<n/2;j++)
    {
      if(a[i]>a[j])
      {
        t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
  } 
    for(i=n/2;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(a[i]<a[j])
      {
        t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
  }
  for(i=0;i<n;i++)
    printf("%d ",a[i]);
	return 0;
}