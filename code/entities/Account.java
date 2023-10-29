package entities;

public abstract class Account {


    private Integer number;
     private String holder;
    protected Double Balance;
        

    public Account(Integer Number, String holder, Double Balance) {

            this.number = number;
            this.holder = holder;
            this.balance = balance;

        }

        public Integer getNumber() {
            return number; 
        }
         
        public Integer setNumber(Integer number) {
            this.number = number;
        }

        public String getHolder() {
            return holder;
        }
        
        public String setHolder(String holder) {
            this.holder = holder;
        }

        public double getBalance() {
            return balance;
        }

        public void withdraw(double amount) {
            balance  -= amount + 5.0;

        }

        public void deposit(double amount) {
            balance += amount;
        }

}