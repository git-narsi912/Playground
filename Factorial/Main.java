#include<stdio.h>
long long int fact(int b) 
{
  if(b>1) 
  {
    return b*fact(b-1);
  }
  else if(b==1) 
  {
    return 1;
  }
}
int main()
{
  int a; 
  scanf("%d",&a);
  printf("%lld",fact(a));
	//your code here
}