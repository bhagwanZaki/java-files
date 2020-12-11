/*
A variable is a name given to the memory location where data is store

Arrays: 
collection of elements of same data type which are always stored consecutively
indexing is used to access the element of an array. 

Data type bit
int - 4 bit
char - 1 bit
float - 4 bit
*/

#include<stdio.h>
// #include<unistd.h>
struct student
    {
        /* data members of structure */
        int rollno;  // size 4 bit
        char name[4] ; // size 50 because the array is of length 50 and is char and each char take 1 bit so 50 * 1 = 50
        float poniter; // size 4 bit
    };
int main()
{
    
    int i;
    int a [10];
    i = 10;
    struct student s;
    s.rollno = 10;
    strcpy(s.name,"zaki");
    s.poniter = 9.8;
    a[0] =1;
    a[3] = 9;
    a[9] = 0;

    // for (i=0;i<10;i++){
    //     a[i] = i + 1;
    //      printf("\n%d",a[i]);
    // }

    printf("\n\t\t Student INFO.");
    printf("\nStudent Name : %s \nStudent Roll number: %d \nPointer : %f ",s.name,s.rollno,s.poniter);

}


// #include<stdio.h>
// struct account
// {
//    char name[5];
//    int number;
// };
  
// int main()
// {
//     struct account profile;
  
//  profile.number = 99;
  
//  profile.name[5] = "jack";
  
//  unsigned int i;
  
//  for(i =0; i < 5; i++)
//    printf(" name %s \n",profile.name[i]); 
    
//    printf(" name %d \n",profile.number); 
  
//    return 0;
// }

// #include <stdio.h>
// #include <string.h>
// int main()
// {
//   struct student
//   {
//     int roll_no;
//     char name[30];
//     int phone_number;
//   };
//   struct student p1 = {1,"Brown",123443};
//   struct student p2, p3;
//   p2.roll_no = 2;
//   strcpy(p2.name,"Sam");
//   p2.phone_number = 1234567822;
//   p3.roll_no = 3;
//   strcpy(p3.name,"Addy");
//   p3.phone_number = 1234567844;
//   printf("First Student\n");
//   printf("roll_no : %d\n", p1.roll_no);
//   printf("name : %s\n", p1.name);
//   printf("phone_number : %d\n", p1.phone_number);
//   printf("Second Student\n");
//   printf("roll_no : %d\n", p2.roll_no);
//   printf("name : %s\n", p2.name);
//   printf("phone_number : %d\n", p2.phone_number);
//   printf("Third Student\n");
//   printf("roll_no : %d\n", p3.roll_no);
//   printf("name : %s\n", p3.name);
//   printf("phone_number : %d\n", p3.phone_number);
//   return 0;
// }