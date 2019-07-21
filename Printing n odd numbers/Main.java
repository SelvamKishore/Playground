#include <stdio.h>
int main() {
	//Type your code
  int count=0,n,i;
  scanf("%d",&n);
  for(i=1;count<n;i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i); 
      count++;
    }
   

  }
	return 0;
}