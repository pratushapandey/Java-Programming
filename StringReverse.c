#include<stdio.h>
#include<string.h>

int main(){
	char ch[20];
	char chrev[20];
	printf("Enter the character : ");
	scanf("%s",&ch);
	
	/*Without Using Function
	int count = 0;
	int i,j;
	
	while(ch[count] != '\0'){
		count++;
	}
	j = count - 1;
	
	for(i = 0; i < count; i++){
		chrev[i] = ch[j];
		j--;
	}
	chrev[i] = '\0';
	printf("Reverse of string is : %s",chrev);*/
	
	/*USING FUNCTION STRREV*/
	strrev(ch);
	printf("Reverse of string is : %s",ch);
	
	return 0;
}
