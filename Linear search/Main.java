#include<iostream> 
using namespace std;
int main()
{
  int arr[100],b,c,i,f=0; 
  cin>>b; 
  for(i=0;i<b;i++) 
  {
    cin>>arr[i]; 
  } 
  cin>>c; 
  for(i=0;i<b;i++) 
  { 
    if(arr[i]==c) 
    { f=1;
      break;}
  } 
  if(f==1)
  cout<<i+1; 
  else
    cout<<c<<" isn't present in the array.";
  //Type your code here
  return 0;
}