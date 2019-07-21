#include<stdio.h>
void main()
{
	int n,i,a[100],s[10],max=0,k=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		s[i]=0;
	}
	for(i=0;i<n;i++)
	{
		if(a[i]>=1 && a[i]<=10)
		{
			int t=a[i]-1;
			s[t]++;
		}
	}
	
	for(i=0;i<n;i++)
	{
		if(s[i]>max)
		{
		max=s[i];
		}
    }
	if(max!=k)
      printf("%d",max);
  else
  {
    printf("%d",a[0]);
  }
}