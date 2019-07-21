#include<stdio.h>
int main() {
   // Type your code here
  int square(int n)
  {
  int r=n*n;
    return r;
  }
  int n;
  scanf("%d",&n);
  int res=square(n);
  printf("%d",res);
   return 0;
}