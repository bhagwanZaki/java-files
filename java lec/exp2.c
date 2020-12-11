#include<stdio.h>

float area(float a)
{
    float area = 3.14*a*a;
    return area;
}

int main()
{
    /* code */
    float r;
    printf("Enter the radius ");
    scanf("%f",&r);
    printf("\nArea of circle is %f",area(r));
    return 0;
}
