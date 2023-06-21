import java.util.Scanner;

//umpire guesser and player
class Player
{

    public int guessNumber() {
        int guessNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! Player Guess the Number:");
        guessNum = sc.nextInt();
        return guessNum;

       
    }

}

class Guesser{

    public int guessNumber() {
        int guessNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! guesser Guess the Number:");
        guessNum = sc.nextInt();
        return guessNum;
    }

}


class Umpire
{ 
    int numGuess;
    int num1;
    int num2;
    int num3;

    public void gervaluefromguesser() {
        Guesser guesser =new Guesser();
        numGuess = guesser.guessNumber();
        
    }

    public void calcResult() {
        System.out.println("Logic not at implemented");
    }

    public void CollectFromPlayer() 
    {
      Player p1 = new Player();
      Player p2 = new Player();
      Player p3 = new Player();
      num1 = p1.guessNumber();
      num2 = p2.guessNumber();
      num3 = p3.guessNumber();

    }

}



public class launch {
    public static void main(String[] args) {
        // System.out.println("HELLo World");
        Umpire umpire = new Umpire();
        umpire.gervaluefromguesser();
        umpire.CollectFromPlayer();
        umpire.calcResult();
    }
    
}
