
#include<stdio.h>
 
int main()
{
    int num1, temp, sum = 0, rem;

    scanf("%d", &num1);
    temp = num1;
    while(num1 != 0)
    {
        rem = num1 % 10;
        sum = sum + (rem * rem * rem);
        num1 = num1 / 10;
    }
    if(sum == temp)
    {
        printf("\Armstrong Number\n", temp);
    }
    else
    {
        printf("Not an Armstrong Number\n", temp);
    }
    return 0;
}