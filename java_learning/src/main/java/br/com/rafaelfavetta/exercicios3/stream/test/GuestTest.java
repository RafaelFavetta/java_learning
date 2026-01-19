package br.com.rafaelfavetta.exercicios3.stream.test;

import br.com.rafaelfavetta.exercicios3.interfaces.domain.AccountType;
import br.com.rafaelfavetta.exercicios3.interfaces.domain.AdminUser;
import br.com.rafaelfavetta.exercicios3.interfaces.domain.GuestUser;
import br.com.rafaelfavetta.exercicios3.interfaces.domain.User;

import java.util.ArrayList;
import java.util.List;

public class GuestTest {
    public static void main(String[] args) {

        AdminUser adminUser1 = new AdminUser(AccountType.ADMIN);
        AdminUser adminUser2 = new AdminUser(AccountType.ADMIN);
        AdminUser adminUser3 = new AdminUser(AccountType.ADMIN);
        AdminUser adminUser4 = new AdminUser(AccountType.ADMIN);
        AdminUser adminUser5 = new AdminUser(AccountType.ADMIN);

        GuestUser guestUser1 = new GuestUser(AccountType.GUEST);
        GuestUser guestUser2 = new GuestUser(AccountType.GUEST);
        GuestUser guestUser3 = new GuestUser(AccountType.GUEST);
        GuestUser guestUser4 = new GuestUser(AccountType.GUEST);
        GuestUser guestUser5 = new GuestUser(AccountType.GUEST);

        List<User> users = new ArrayList<>();

        users.add(adminUser1);
        users.add(adminUser2);
        users.add(adminUser3);
        users.add(adminUser4);
        users.add(adminUser5);

        users.add(guestUser1);
        users.add(guestUser2);
        users.add(guestUser3);
        users.add(guestUser4);
        users.add(guestUser5);

        users.stream()
                .filter(user -> user.getAccountType() == AccountType.ADMIN)
                .forEach(user ->
                        System.out.println(user.getAccountType()));
    }
}
