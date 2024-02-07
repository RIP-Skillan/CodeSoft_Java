import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin;
        System.out.println("---Welcome to RIP Bank---");
        while(true){
            System.out.print("Enter ATM pin :");
            pin=sc.nextInt();
            if(pin!=1234) System.out.println("Invalid Pin... Try Again...");
            else{
                System.out.println("Successfully Logged in...");
                ATM atm=new ATM();
                while(true){
                    System.out.println("------Menu------\n1) Withdraw\n2) Deposit\n3) Check Balance\n4) Exit");
                    int ch;
                    ch=sc.nextInt();
                    switch(ch){
                        case 1:
                            System.out.println("Enter Amount: ");
                            atm.withdraw(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter Amount: ");
                            atm.deposit(sc.nextInt());
                            break;
                        case 3:
                            atm.checkBalance();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Invalid Choice...");
                    }
                }
            }
        }
    }
}

class BankAC{
    int balance;
    BankAC(){
        balance=10000;
    }
}

class ATM extends BankAC{
    void withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("New Balance: "+balance);
        }else System.out.println("No sufficient balance");
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("New Balance: "+balance);
    }
    void checkBalance(){
        System.out.println("Current Balance: "+balance);
    }
}

