#include<stdio.h>
int main()
{
  // Type your code here
  char a[1000];
  scanf("%[^\t]s",a);
  int i,j,l=strlen(a);
  int stop=l;
  for(i=l-1;i>=0;i--)
  {
    if(a[i]==' ')
    {
      for(j=i+1;j<stop;j++)
        	printf("%c",a[j]);
      stop=i;
      printf(" ");
    }    
  }
  for(i=0;i<stop;i++)
    	printf("%c",a[i]);
  return 0;
}