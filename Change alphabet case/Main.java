#include <iostream>
#include<ctype.h>  
using namespace std;
int main() { 
  char ch; 
  cin>>ch; 
  if(islower(ch)) 
    ch=toupper(ch); 
  else 
    ch=tolower(ch); 
  cout<<ch;
	// Type your code here
	return 0;
}