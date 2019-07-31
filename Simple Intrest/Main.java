#include<stdio.h> 
int main()
{
  float c,d,a,b; scanf("%f%f",&a,&b); 
  scanf("%f%f",&c,&d);
  d=a*b*c/100; 
  printf("%.6f",d);
  //your code here
  return 0;
}