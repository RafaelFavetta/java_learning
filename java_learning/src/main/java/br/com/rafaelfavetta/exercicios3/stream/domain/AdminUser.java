package br.com.rafaelfavetta.exercicios3.stream.domain;

public class AdminUser extends User implements UserActions{

    public AdminUser(AccountType accountType, String name) {
        super(accountType, name);
    }

    @Override
    public void deleteContent() {
        System.out.println("Admin deleted content.");
    }

    @Override
    public void deleteProfilePicture() {
        System.out.println("Admins can't delete someone's profile picture.");
    }

    @Override
    public void postStory() {
        System.out.println("Admins can't post a story.");
    }

    @Override
    public void followAnAccount() {
        System.out.println("Admins can't follow anybody.");
    }


}
