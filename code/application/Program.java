package code.application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import code.application.Account;
import code.application.BusssinessAccount;
import code.application.SavingsAccount;

public class Program {
    

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        list<Account> list = new ArrayList<>();



            list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
            list.add(new BussinessAccount(1002, "Lucas", 300.00, 0,04));
            list.add(new SavingsAccount(1003, "Marcos", 100.00, 0.08));
            list.add(new BussinessAccount(1004, "Foster", 700.00, 0.02));

            double sum = 0.0;

            for(Account acc: list) {
                    sum += acc.getBalance();
            }

                System.out.println("Total balance: %.2f%n", sum);

                for(Account acc: list) {    // para cada conta na minha lista, inserir 10 reais amais   //
                    acc.deposit(10.0);
                }
                
                for(Account acc: list) {  // Mostrar o valor atualizado de cada conta
                    System.out.printf("Updated balance for account %d: %.2f%n", acc.getBalance(), acc.getNumber());
                }
            }



}
