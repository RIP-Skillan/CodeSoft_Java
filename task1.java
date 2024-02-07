import java.util.Random;
import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        int i,g,n;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        while(true){
            System.out.print("\033[H\033[2J");
            n=r.nextInt(100);
            System.out.println("The Computer has thought of a Number between 1 and 100.\nYou have 10 chances to get it right!\n");
            for(i=0;i<10;i++){
                System.out.print("Guess the number: ");
                g=sc.nextInt();
                if(g>n) System.out.println("You guessed too high!");
                else if(g<n) System.out.println("You guessed too low!");
                else{
                    System.out.println("Yay you got it right in "+(i+1)+" tries");
                    break;
                }
            }
            System.out.print("Do you want to play again? (Y/N): ");
            sc.nextLine();
            if(!("Y".equalsIgnoreCase(sc.nextLine()))) break;
        }
        sc.close();
    }
}