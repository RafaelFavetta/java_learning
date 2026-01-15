package br.com.rafaelfavetta.exercicios2.inheritance.domain;

public class Playmaker extends Player {

    public Playmaker(String name, double ovr) {
        super(name, ovr);
    }

    @Override
    public double calculateImpact() {
        return ovr * 1.25;
    }

    public void callPlays(){
        System.out.println("Let's run \"floppy\", guys!!");
        System.out.println("Said " + name);
        System.out.println();
    }
}
