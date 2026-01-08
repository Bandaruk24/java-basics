
//Encapsulation is the process of binding data and methods together and restricting direct access to the data using access modifiers.
public class Encapsulation {
    static class BankAccount{
        // Private data (hidden)
        private double balance;

        // constructor
        public BankAccount(double balance){
            this.balance=balance;
        }

        //Getter (read-only access)
        public double getBalance(){
            return balance;
        }

        //Setter (Controlled write access)
        public void deposit(double amount){
            if(amount>0){
                balance+=amount;
            }
        }
        public void withdraw(double amount){
            if(amount>0 && amount<=balance){
                balance-=amount;
            }
        }
    }

    public static void main(String[] args){
        BankAccount account = new BankAccount(5000);// Contructor method balance
        account.deposit(2000);
        account.withdraw(1000);
        System.out.println("Bank Balance: "+account.getBalance());
    }
}
