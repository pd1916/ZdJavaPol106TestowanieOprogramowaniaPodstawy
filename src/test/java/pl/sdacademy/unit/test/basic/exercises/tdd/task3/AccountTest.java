package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private static Customer customer1;
    private static Customer customer2;
    private static final String INCORRECT_ACCOUNT_NUMBER_1 = "11111111111111111111";
    private static final String CORRECT_ACCOUNT_NUMBER_1 = "11111111111111111111111111";
    private static final String INCORRECT_ACCOUNT_NUMBER_2 = "22222222222222222222";
    private static final String CORRECT_ACCOUNT_NUMBER_2 = "22222222222222222222222222";

    @BeforeAll
    static void init() {
        customer1 = new Customer("Jan", "Kowalski");
        customer2 = new Customer("Ala", "Nowak");
    }

    // credit: 1000, {26}
    // debit: 2000, {26}
    // amount: 100
    // result: credit:1100, debit:1900
    @Test
    void shouldTransferMoney() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, customer1);
        Account debit = new Account(2000, CORRECT_ACCOUNT_NUMBER_2, customer2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1900, debit.getBalance());
        assertEquals(1100, credit.getBalance());
    }

    // credit: 1000, {20}
    // debit: 2000, {26}
    // result: brak przelewu
    @Test
    void shouldNotTransferMoneyIfCreditAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, INCORRECT_ACCOUNT_NUMBER_1, customer1);
        Account debit = new Account(2000, CORRECT_ACCOUNT_NUMBER_2, customer2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfDebitAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, customer1);
        Account debit = new Account(2000, INCORRECT_ACCOUNT_NUMBER_2, customer2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    // credit: 1000, {26}
    // debit: 50, {26}
    // amount: 100
    // result: brak przelewu
    @Test
    void shouldNotTransferMoneyIfAmountIsGreaterThanBalance() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, customer1);
        Account debit = new Account(50, CORRECT_ACCOUNT_NUMBER_2, customer2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(50, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfAmountIsEqualToZero() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, customer1);
        Account debit = new Account(50, CORRECT_ACCOUNT_NUMBER_2, customer2);
        //when
        debit.transferMoney(credit, 0);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(50, debit.getBalance());
    }

    // credit: 1000, {26}
    // debit: 50, {26}
    // amount: 50
    // result: credit:1050, debit:0
    @Test
    void shouldTransferMoneyIfAmountIsEqualToBalance() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, customer1);
        Account debit = new Account(50, CORRECT_ACCOUNT_NUMBER_2, customer2);
        //when
        debit.transferMoney(credit, 50);
        //then
        assertEquals(1050, credit.getBalance());
        assertEquals(0, debit.getBalance());
    }
}