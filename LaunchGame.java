 
import java.util.Scanner;

class Guesser
{
    int guessNum; //This variable  store the guessed number.

    // This method will ask the guesser to enter the number which players have to be guessed, and returns it to the UMPIRE 

    public int guessingNumber()
    {
       
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser! Kindly Guess the Number ");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;

    //This method will ask player to enter their guessed number, and returned the guess num to the umpire.

    public int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! Kindly Guess the number ");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
/* The class umpire contains the guessed number, by the guesser and players  */

class Umpire
{
    int numFromGuesser; //stores the guesser number
    int numFromPlayer1; //stores the Player1 number
    int numFromPlayer2;//stores the Player2 number
    int numFromPlayer3;//stores the Player3 number


public void collectNumFromGuesser()
{
    Guesser g=new Guesser();
    numFromGuesser=g.guessingNumber();
}
/* This method collect nums from all the 3 players and stores in new variable as written below variables */
public void collectNumFromPlayers()
{
    Player p1=new Player();
    Player p2=new Player();
    Player p3=new Player();

    numFromPlayer1=p1.guessingNumber();
    numFromPlayer2=p2.guessingNumber();
    numFromPlayer3=p3.guessingNumber();
}
/* This method compare the guessed value and player value */
public void compare()
{
    if(numFromGuesser==numFromPlayer1)
    {
        if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
        {
            System.out.println("Sab ke sab jeet gye ");
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            System.out.println("Player 1 and player 2 jeet gye ");
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 1 and player 3 jeet gye ");
        }
        else
        {
            System.out.println("Player 1 won the game ");
        }
        
    }
    else if (numFromGuesser==numFromPlayer2)
    {
        if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 2 and player 3 jeet gye ");
        }
        else
        {
            System.out.println("Player 2 won the game ");
        }
        
    }
    else if(numFromGuesser==numFromPlayer3)
    {
        System.out.println("Player 3 won the game ");
    }
    else 
    {
        System.out.println("Sab ke sab galat hai ");
    }
}
} 

public class LaunchGame {
     public static void main(String[] args)
     {
        System.out.println("Game Started! ");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();



     }
}
