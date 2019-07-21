#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int sec=larg(n1,n2);
  if(sec<n3)
    printf("%d",n3);
  else
    printf("%d",sec);
  	return 0;
}
int larg(int a,int b)
{
  if(a>b)
    return a;
  else
    return b;
}