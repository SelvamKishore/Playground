// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n,i;
  scanf("%d",&n);
  int a[n];
 int  max=0;
  for(i=0;i<=n-1;i++)
  {  scanf("%d",&a[i]);
  if(a[i]>max)
    max=i;
  }
  printf("%d",max);
   return 0;
}