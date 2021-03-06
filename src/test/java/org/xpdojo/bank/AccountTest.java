package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    Account objA = new Account();
    int b = 10;

    @Test
    public void getbalance () {assertThat(objA.bal=0);}
    @Test
    public void setbalance () {assertThat(objA.setBalance(10)==10);}
    @Test
    public void depositMoney() {
        objA.depositMoney(20);
        assertThat(objA.bal=30);
    }
    @Test
    public void withdrawMoney() {
        objA.withdrawMoney(7);
        assertThat(objA.bal=23);
    }
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }
}
