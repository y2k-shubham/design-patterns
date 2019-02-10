package week_1.facade;

import week_1.facade.accounts.IAccount;

import java.math.BigDecimal;

public class Customer {

    public static void main(String[] args) {
        BankingService myBankingService = new BankingService();

        // create accounts
        int savingsAccountNumber = myBankingService.createAccount("savings", BigDecimal.valueOf(500));
        int investmentAccountNumber = myBankingService.createAccount("investment", BigDecimal.valueOf(1000));

        // transfer between accounts
        myBankingService.transfer(savingsAccountNumber, investmentAccountNumber, BigDecimal.valueOf(200));

        // balance enquiry
        myBankingService.getBalance(savingsAccountNumber);
        myBankingService.getBalance(investmentAccountNumber);
    }
}
