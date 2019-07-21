#include <stdio.h>

int main(int argc, char *argv[])
{
  //Type your code here
   int n;
  scanf("%d",&n);
  printf("%d",rec(n));
  return 0;
}
int rec(int n)
{
  if(n>0)
  {
    return n+rec(n-1);
  }
}