#include<iostream> 
using namespace std; 
int main()
{
  int a,b,d[10]; 
  cin>>a; 
 b=0; 
  while(a!=0) 
  {
    d[b]=a%8; 
    b++;
    a=a/8;
  } 
  for(int i=b-1;i>=0;i--) 
  { 
  cout<<d[i];
  }
  //Type your code here
  return 0;
}