package br.com.rafaelfavetta.exercicios3.association.domain;

import java.util.ArrayList;
import java.util.List;

public class Show {

    private String city;
    List<Artist> artists;

    public Show(String city, List<Artist> artists) {
        this.city = city;
        this.artists = artists;
    }

    public void addArtists(Artist artist){
        artists.add(artist);
    }

    public void listArtists(){
        for (Artist artist : artists){
            System.out.println(artist.getName());
        }
    }
}
