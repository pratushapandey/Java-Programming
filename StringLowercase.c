#include<stdio.h>
#include<string.h>

int main(){
	char ch[20];
	
	printf("Enter the character : ");
	scanf("%s",&ch);
	
	/*USING FUNCTION STRLWR()
	strlwr(ch);
	printf("The character in lower case : %s",ch);*/
	
	int i;
	for(i = 0; ch[i]!='\0'; i++){
		if(ch[i] >= 'A' && ch[i] <= 'Z'){
			ch[i] += 32;
		}
	}
	printf("The character in lower case : %s",ch);
	return 0;
}
