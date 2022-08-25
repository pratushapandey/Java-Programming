import java.lang.*;
import java.util.*;

class Game{
    int UserGuess;
    int ComputerInput;
    int noOfGuesses = 0;

    public Game(){
        Random random = new Random();
        ComputerInput = random.nextInt(10);
    }
    public void UserInput(int num){
        UserGuess = num;
    }
    public boolean isCorrectNumber(){
        if(UserGuess == ComputerInput){
            System.out.println("Correct Guess");
            noOfGuesses = noOfGuesses +1;
            return true;
        }
        else{
            System.out.println("Wrong Guess");
            noOfGuesses = noOfGuesses +1;
            return false;
        }
    }
}
public class GuessTheNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GUESS THE NUMBER GAME");
        Game game = new Game();
        System.out.println("Guess the number from 0 yo 10:");
        game.UserInput(sc.nextInt());
        while(!game.isCorrectNumber()){
            System.out.println("Guess the number again:");
            game.UserInput(sc.nextInt());
        }
        sc.close();
    }
}