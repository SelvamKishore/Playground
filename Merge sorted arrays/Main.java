#include <stdio.h>
int main() 
{
	//write your code here
  int m,n,i,j=0,k;
  scanf("%d %d",&m,&n);
  int a[m],b[n],c[m+n];
  for(i=0;i<m;i++)
  {
    scanf("%d",&a[i]);
    c[j++]=a[i];
  }
  for(i=0;i<n;i++)
  {
    scanf("%d",&b[i]);
    c[j++]=b[i];
  }
  for(i=0;i<j;i++)
  {
    for(k=i+1;k<j;k++)
    {
      if(c[i]>c[k])
      {
        int t=c[i];
        c[i]=c[k];
        c[k]=t;
      }
    }
  }
for(i=0;i<j;i++)
  printf("%d ",c[i]);
	return 0;
}