#include<stdio.h>
#include<math.h>>
int main()
{ 
  long  long int a,b,c,d,e=0,f=0,g; 
  scanf("%lld",&a); 
  c=a; 
  while(a!=0) 
   { 
     b++;
     a=a/10; 
   } 
  while(c!=0)
  {
    d=c%10; 
    e=e + d*pow(2,f); 
    f++; 
    c=c/10;
  } 
  printf("%lld",e);
  //Type your code here
  return 0;
}