#include<stdio.h>

enum week { Mon =1 , Tues, Wed, Thurs, Fri, Sat, Sun
};

enum month { Jan, Feb, March, April, May, June, July, Aug, Sept, Oct, Nov, Dec
};

int main(){
	int i;
	enum week day;
	day = Fri;
	
	for(i = Mon ; i <= Sun ; i++){
		printf("%d\t",i);
	}
	
	return 0;
}
