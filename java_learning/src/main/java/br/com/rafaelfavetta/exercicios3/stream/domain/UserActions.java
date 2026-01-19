package br.com.rafaelfavetta.exercicios3.stream.domain;

public interface UserActions {

    AccountType getAccountType();
    void deleteContent();
    void deleteProfilePicture();
    void postStory();
    void followAnAccount();
}
