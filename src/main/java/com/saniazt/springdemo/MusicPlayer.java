package com.saniazt.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic(GenresOfMusic genresOfMusic) {
        if (genresOfMusic == GenresOfMusic.CLASSICAL) return "Playing: some classic song";
        else return "Playing some rock song!!";

    }
}
