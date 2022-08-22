import java.lang.*;
import java.util.*;

public class RockPaperScissor{
    public static void main(String[]args){

        // 0 for Rock, 1 for Paper, 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor : ");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);
        System.out.println("Input by computer : " + computerinput);

        if(userinput == computerinput){
            System.out.println("Draw");
        }
        else if(userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1 || userinput == 0 && computerinput == 2){
            System.out.println("You Win");
        }
        else{
            System.out.println("Computer Wins");
        }
        sc.close();
    }
}