#include <stdio.h>
int main() {
	//Type your code
  int i,n,n1,n2,n3,sum=0,f=1,f1=1,f2=1;
  scanf("%d",&n);
  n1=n%10;
  n2=(n%100)/10;
  n3=n/100;
 for(i=1;i<=n1;i++)
 {
   f*=i;
 }
  for(i=1;i<=n2;i++)
 {
   f1*=i;
 }
  for(i=1;i<=n3;i++)
 {
   f2*=i;
 }
  if((f+f1+f2)==n)
    printf("Yes");
  else
    printf("No");
	return 0;
}