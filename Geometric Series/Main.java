#include<iostream> 
#include<math.h>
using namespace std; 
int main() 
{ 
int a,b,c,n,s=1,p=0,x,y; 
cin>>n;
b=2; 
c=3; 
if(n%2==0) 
{y=(n-1)/2;
	x=pow(3,y);
}
else 
{y=(n-1)/2;
	x=pow(2,y);
} 
cout<<x;

}