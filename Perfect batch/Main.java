/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,s=0,s1=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<=n-1;i++)
    scanf("%d",&a[i]);
  for(i=0;i<n/2;i++)
  {s+=a[i];}
  for(i=n/2;i<n;i++)
  {s1+=a[i];}
  if(s==s1)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}