#include<stdio.h>
#include<string.h>

int main()
{
	char ch[2000];
	printf("Enter the character : ");
	scanf("%s",&ch);
	
	/*Without Using String Function
	int i;
	for(i = 0 ; ch[i] != '\0'; i++){
	}
		printf("The length of the string without using function:%d ",i);*/
	
	/*Using Funtion Strlen*/	
	int len;
	len = strlen(ch);
	printf("The length of the string using function :%d",len);
	
	return 0;
}
