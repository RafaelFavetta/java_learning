package br.com.rafaelfavetta.exercicios3.interfaces.test;

import br.com.rafaelfavetta.exercicios3.interfaces.domain.*;

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

        for (User u : users) {
            System.out.println(u.getAccountType());
            u.deleteContent();
            u.deleteProfilePicture();
            u.followAnAccount();
            u.postStory();
            System.out.println();
        }

    }
}
