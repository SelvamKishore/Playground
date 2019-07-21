#include<stdio.h>
int main()
{
	//Try out your code here
  int n,i,j,k;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
		if(a[i]<a[j])
          printf("%d,%d\n",a[i],a[j]);
    }
  }
	return 0;
}