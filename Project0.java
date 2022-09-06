//Omar Morales
//CS2400
//Project0
//9-5-2022
import java.util.Scanner;
public class Project0 {
    public static void main(String[] args) {
        
        System.out.println("Enter 1-3 to choose rock, paper, or scissors:");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int compint = (int)(Math.random()*3)+1;
        int computer =compint;
        if (isValidChoice(input)==false)
            System.out.println("Error");
        else{
        System.out.print("You chose: "+userChoice(input));
         System.out.println("\nComputer chose: "+computerChoice(computer));
         determineWinner(input,compint);
        
        }
    }
    public static String computerChoice(int computer){
        if (computer ==1)
            return "Rock";
        if(computer == 2)
        return "Paper";
         if(computer==3)
            return "Scissors";
        return null;
         
        }
      public static String userChoice(int input){
          if (input ==1)
              return "Rock";
          if (input ==2)
              return "Paper";
          if (input ==3);
          return "Scissors";
          
      }   
      public static boolean isValidChoice(int input){
          if (input==1||input==2||input==3)
        return true;
          else
              return false;
          
      }
      public static void determineWinner(int input, int compint ){
          if (input==compint)
              System.out.println("Please play the game again");
          else{
          if (input==1&&compint==2)
               System.out.println("Computer wins");
          if (input==1&&compint==3)
               System.out.println("You win");
          if (input==2&&compint==1)
               System.out.println("You win");
          if (input==2&&compint==3)
               System.out.println("Computer wins");
          if (input==3&&compint==1)
               System.out.println("Computer wins");
          if (input==3&&compint==2)
               System.out.println("You win");
          }
      }


    }