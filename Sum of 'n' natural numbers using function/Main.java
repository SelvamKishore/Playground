#include<stdio.h>
int main() {
    // Type your code here
  int sum(int m)
  {
    int i,s=0;
  for(i=m;i>=0;i--)
  {
    s+=i;
  }
    return s;
  }
  int n;
  scanf("%d",&n);
  int res=sum(n);
  printf("%d",res);
  	return 0;
}