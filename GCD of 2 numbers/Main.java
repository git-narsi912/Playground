// C++ program to find GCD of two numbers 
#include <iostream> 
using namespace std; 
// Recursive function to return gcd of a and b 
int gcd(int a, int b) 
{ 
	// Everything divides 0 
	if (a == 0) 
	return b; 
	if (b == 0) 
	return a; 

	// base case 
	if (a == b) 
		return a; 

	// a is greater 
	if (a > b) 
		return gcd(a-b, b); 
	return gcd(a, b-a); 
} 

// Driver program to test above function 
int main() 
{ 
	int a ,b; 
  cin>>a>>b;
	cout<<gcd(a, b); 
	return 0; 
} 
