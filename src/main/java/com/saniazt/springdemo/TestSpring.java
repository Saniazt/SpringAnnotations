package com.saniazt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       /* Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicP layer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();*/

       /* MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/
/*        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);


        context.close(); //Обязательно в конце
    }
}
