#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  printf("%d",rec(n));
}
  int rec(int n)
  {
    if(n==0)
      return 1;
      return n*rec(n-1);
  }
	