package br.com.rafaelfavetta.exercicios3.interfaces.domain;

public class GuestUser extends User implements UserActions{

    public GuestUser(AccountType accountType) {
        super(accountType);
    }

    @Override
    public void deleteContent() {
        System.out.println("Guests can't delete contents.");
    }

    @Override
    public void deleteProfilePicture() {
        System.out.println("Guest deleted their profile picture.");
    }

    @Override
    public void postStory() {
        System.out.println("Guest posted a story.");
    }

    @Override
    public void followAnAccount() {
        System.out.println("Guest followed someone's account.");
    }
}
