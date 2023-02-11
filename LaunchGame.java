 
import java.util.Scanner;

class Guesser
{
    int guessNum;

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

    public int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! Kindly Guess the number ");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


public void collectNumFromGuesser()
{
    Guesser g=new Guesser();
    numFromGuesser=g.guessingNumber();
}
public void collectNumFromPlayers()
{
    Player p1=new Player();
    Player p2=new Player();
    Player p3=new Player();

    numFromPlayer1=p1.guessingNumber();
    numFromPlayer2=p2.guessingNumber();
    numFromPlayer3=p3.guessingNumber();
}
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
