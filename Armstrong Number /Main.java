#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int  n,r=0,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
  r+=pow(n%10,3);
    n/=10;
  }
if(temp==r)
  printf("Armstrong Number");
else
  printf("Not an Armstrong Number");
	return 0;
}