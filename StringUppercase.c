#include<stdio.h>
#include<string.h>

int main(){
	char ch[20];
	
	printf("Enter the character : ");
	scanf("%s",&ch);
	
	/*USING FUNCTION STRUPR()
	strupr(ch);
	printf("The character in upper case : %s",ch);*/
	
	int i;
	for(i = 0; ch[i] != '\0'; i++){
		if(ch[i] >= 'a' && ch[i] <= 'z'){
			ch[i] -= 32;
		}
	}
	printf("The character in upper case : %s",ch);
	
	return 0;
}
