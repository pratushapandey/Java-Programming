#include<stdio.h>
#include<string.h>

int main(){
	char str1[20];
	char str2[20];
	
	printf("Enter the first string : ");
	scanf("%s",&str1);
	printf("Enter the second string : ");
	scanf("%s",&str2);
	
	/*Using Function Strcmp
	int i = strcmp(str1,str2);
	printf("The strcmp value using function is: %d\n",i);
	
	if(i == 0)
	printf("Strings are same\n");
	
	else
	printf("Strings are not same\n");*/
	
	/*Without Using Function*/
	int result, i;
	for(i = 0; str1[i] == str2[i] && str1[i] == '\0'; i++);
	
		if(str1[i] == str2[i])
		printf("Str1 and Str2 are same");
		
		else if(str1[i] < str2[i])
		printf("Str1 is less than Str2");
		
		else
		printf("Str1 is greater than Str2");
	
	return 0;
}
