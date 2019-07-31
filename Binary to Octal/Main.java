#include<stdio.h>
#include<math.h>
int main() 
{
  long  long int a,b,c,e=0,f=0,g; 
  scanf("%lld",&a); 
  c=a; 
  while(a!=0) 
   { 
     b++;
     a=a/10; 
   } 
  while(c!=0)
  {
   g=c%10; 
    e=e + g*pow(2,f); 
    f++; 
    c=c/10;
  }  
  int d[10]; 
 b=0; 
  while(e!=0) 
  {
    d[b]=e%8; 
    b++;
    e=e/8;
  } 
  for(int i=b-1;i>=0;i--) 
  { 
 printf("%d",d[i]);
  }
}