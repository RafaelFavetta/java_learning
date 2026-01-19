package br.com.rafaelfavetta.exercicios3.interfaces.domain;

public class User implements UserActions{

    protected AccountType accountType;

    public User(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public void deleteContent() {

    }

    @Override
    public void deleteProfilePicture() {

    }

    @Override
    public void postStory() {

    }

    @Override
    public void followAnAccount() {

    }
}
