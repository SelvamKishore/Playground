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
		
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
            {
        
			int t=a[i];
				a[i]=a[j];
				a[j]=t;
            }
        }
	}
	for(i=0;i<n;i++)
		printf("%d\n",a[i]);
}