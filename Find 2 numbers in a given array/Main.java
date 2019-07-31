#include<iostream> 
using namespace std; 
int main()
{
  int a,b,c,d,ed,arr[100],i; 
  cin>>a; 
  for(i=0;i<a;i++) 
  { 
    cin>>arr[i]; 
  } 
  cin>>b>>c; 
  for(i=0;i<a;i++) 
  { 
    if(arr[i]==b) 
    {d=1; 
     break; 
    }
  } 
  if(d==1) 
    cout<<"Element 1 index = "<<i<<"\n"; 
  else 
    cout<<"Element 1 index = -1\n"; 
  
  for(i=0;i<a;i++) 
  { 
    if(arr[i]==c) 
    {ed=1; 
     break; 
    }
  } 
  if(ed==1) 
    cout<<"Element 2 index = "<<i<<"\n"; 
  else 
    cout<<"Element 2 index = -1\n"; 
  
  
  	//type your code here
}