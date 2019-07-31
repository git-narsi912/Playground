#include<iostream> 
using namespace std; 
int main()
{ 
  int a,b,c,n; 
  a=0;
  b=1; 
  cin>>n; 
  cout<<a<<" "<<b<<" ";
  for(int i=2;i<n;i++) 
  {
    c=a+b; 
    a=b; 
    b=c; 
    cout<<c<<" ";
  } 
  
  //Type your code here
  return 0;
}