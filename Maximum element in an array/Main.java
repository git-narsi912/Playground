#include<iostream> 
using namespace std;
int main()
{ 
  int max=0,arr[100],n; 
  cin>>n; 
  for(int i=0;i<n;i++) 
  { 
    cin>>arr[i];
  }  
  max=arr[0]; 
  for(int i=0;i<n;i++) 
  {
    if(max<arr[i])
    {
      max=arr[i];
    } 
    else 
      continue;
  }
  cout<<max;
  	//type your code here
}