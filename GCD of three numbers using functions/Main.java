#include <stdio.h>
int main() {
	//Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int temp=gcd(n1,n2);
   int min1,t1;
  if(temp>n3)
    min1=temp;
  else
    min1=n3;
  while(min1>=1)
  {
    if((temp%min1==0)&&(n3%min1==0))
    {
      t1=min1;
      break;
    }
    min1--;
  }
  printf("%d",t1);
	return 0;
}
int gcd(int a,int b)
{
  int min,t;
  if(a>b)
    min=b;
  else
    min=a;
  while(min>=1)
  {
    if((a%min==0)&&(b%min==0))
    {
      t=min;
      break;
    }
    min--;
  }
  return t;
}