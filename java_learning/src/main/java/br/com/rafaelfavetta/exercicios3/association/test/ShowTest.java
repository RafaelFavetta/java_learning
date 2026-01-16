package br.com.rafaelfavetta.exercicios3.association.test;

import br.com.rafaelfavetta.exercicios3.association.domain.Artist;
import br.com.rafaelfavetta.exercicios3.association.domain.Show;

import java.util.ArrayList;
import java.util.List;

public class ShowTest {
    public static void main(String[] args) {

        List<Artist> artists = new ArrayList<>();

        Artist xxxtentacion = new Artist("XXXTentacion");
        Artist lilPeep = new Artist("Lil Peep");
        Artist juiceWrld = new Artist("Juice WRLD");

        Show showBR = new Show("Araras", artists);

        showBR.addArtists(xxxtentacion);
        showBR.addArtists(lilPeep);
        showBR.addArtists(juiceWrld);

        showBR.listArtists();
    }
}
