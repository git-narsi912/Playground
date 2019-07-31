#include <stdio.h>
#include<math.h>
int main() {
  int a,d,c=0,e,x,y; 
  scanf("%d",&a) ;
d=a;
  while(d!=0) 
  {
    c++;
    d=d/10;
   
  }
  d=pow(10,(c)) ;
 e=pow(10,(c-1)) ;
  x=(a%d)/e;
  y=a%10; 
  printf("%d",x+y); 
  
	//Type your code
	return 0;
}