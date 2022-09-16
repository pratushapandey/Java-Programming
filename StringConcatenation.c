#include<stdio.h>
#include<string.h>

int main(){
	char ch1[20];
	char ch2[20];
	
	printf("Enter the first character : ");
	scanf("%s",&ch1);
	printf("Enter the second character : ");
	scanf("%s",&ch2);
	
		/*Without using Function*/
	int i,j;
	for(i = 0; ch1[i] != '\0'; ++i){
	}
	for(j = 0; ch2[j] != '\0'; ++i,++j){
		ch1[i] = ch2[j];
	}
	ch2[i] = '\0';
	printf("The string after concatenation without using function is : %s",ch1); 
	/*Using Function Strcat
	strcat(ch1,ch2);
	printf("The string after concatenation using function is : %s",ch1);*/
	
	return 0;
}
