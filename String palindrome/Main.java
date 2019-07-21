#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char a[1000],b[1000];
  scanf("%s",a);
  int i,l=strlen(a),j=0;
  for(i=l-1;i>=0;i--)
  {
    b[j]=a[i];
    j++;
  }
  if(strcmp(a,b)==0)
    printf("%s is a palindrome",a);
  else
    printf("%s is not a palindrome",a);
  return 0;
}