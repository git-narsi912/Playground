#include <stdio.h>
#include<math.h>
int main() {
  int a,d,c=0,e; 
  scanf("%d",&a) ;
d=a;
  while(d!=0) 
  {
    c++;
    d=d/10;
   
  }
  d=pow(10,(c-1)) ;
 e=pow(10,(c-2)) ;
  printf("%d",(a%d)/e);
	//Type your code
	return 0;
}