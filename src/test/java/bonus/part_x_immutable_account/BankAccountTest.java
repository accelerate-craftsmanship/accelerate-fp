package bonus.part_x_immutable_account;

import bonus.part_x_immutable_account.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    @Test
    void verifyBankAccount() {
        BankAccount account = new BankAccount("John Doe");
        assertEquals("John Doe", account.getHolder());
        assertEquals(0, account.getBalance());

        account.deposit(1000);
        assertEquals(1000, account.getBalance());

        account.withdraw(500);
        assertEquals(500, account.getBalance());

        account.withdraw(600);
        assertEquals(500, account.getBalance());
    }

}