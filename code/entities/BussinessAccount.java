import entities.Account;

package entities;

public class BussinessAccount extends Account {

    private Double loanLimit;

    public BussinessAccount() {
        super();
    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit() {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if(amount <= loanLimit) {
            balance += amount amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
    
}