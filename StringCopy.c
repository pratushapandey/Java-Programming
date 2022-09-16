#include<stdio.h>
#include<string.h>

int main(){
	char ch[30];
	char newCh[30];
	
	printf("Enter the character : ");
	scanf("%s",&ch);
	
	/*Using Strcpy Function
	strcpy(newCh,ch);
	printf("The newCh after string copy function is : %s",newCh);*/
	
	/*Without using Function*/
	int i = 0 ;
	while(ch[i] != '\0'){
		newCh[i] = ch[i];
		i++;
	}
	i++;
	newCh[i]='\0';
	printf("The newCh without string copy function is : %s",newCh);
	
	return 0;
}
