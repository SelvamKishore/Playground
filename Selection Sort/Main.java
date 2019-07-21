#include<stdio.h>
void main()
{
	int j,i,n,min;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
        
			int t=a[min];
				a[min]=a[j];
				a[j]=t;
        }
	}
	for(i=n-1;i>=0;i--)
		printf("%d\n",a[i]);
}