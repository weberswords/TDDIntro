package com.thoughtworks.tddintro.exercises.accountbalance;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class AccountTests {

    Account account = new Account();

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.setBalance(100);
        account.deposit(50);

        assertThat(account.getBalance(), is(150));

    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        fail();
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        fail();
    }
}
