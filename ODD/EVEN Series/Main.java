#include<iostream> 
using namespace std;
int main()
{ 
int a,b,n; 
  a=b=0; 
  cin>>n; 
 for(int i=0;i<n;i++) 
 {if(i%2!=0) 
   {  
   a=a+2; 
   } 
  else if(i%2==0) 
  {
   b=a/2; 
  }
 }
  if(n==1 || n==2) 
  {
    cout<<"0";
  } 
  else if(n%2==0) 
  { 
    cout<<b; 
  }  
  else 
  {
     cout<<a; 
  } 
  
	//type your code here
	
}