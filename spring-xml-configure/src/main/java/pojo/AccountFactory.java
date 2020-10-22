package pojo;

public class AccountFactory {
    public static Account createAccount(int account){
        return new Account(account);
    }
}
