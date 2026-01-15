package br.com.rafaelfavetta.exercicios2.interfaces.domain;

public class Player implements Clutch{

    protected String name;
    protected int age;
    protected int ovr;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getOvr() {
        return ovr;
    }

    public Player(String name, int age, int ovr) {
        this.name = name;
        this.age = age;
        this.ovr = ovr;
    }

    @Override
    public boolean isClutch(int secondsLeft) {
        return age >= 26 || ovr >= 85;
    }
}
