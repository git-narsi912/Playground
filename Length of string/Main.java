#include<stdio.h>
#include<iostream>  
#include<string.h>
using namespace std;
int main()
{
  char ch[100]; 
  fgets(ch,100,stdin); 
  cout<<strlen(ch);
  //Type your code here
  return 0;
}