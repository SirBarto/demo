package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Document(collection = "games")

public class Game {

    @Id
    int id;
    String game_name;
    String date_game;
    String plays;
    String max_player_number;
    String about_game;
    String author;
    String first_play;
    String last_play;
    int id_location;
    //game_icon

    public Game(int id,String game_name,String date_game, String plays,
                String max_player_number, String about_game,String author,String first_play, String last_play,
                int id_location)
    {
      this.id=id;
      this.game_name=game_name;
      this.date_game=date_game;
      this.plays=plays;
      this.max_player_number=max_player_number;
      this.about_game=about_game;
      this.author=author;
      this.first_play=first_play;
      this.last_play=last_play;
      this.id_location=id_location;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getGame_name() {
        return game_name;
    }
    public void setGame_name(String game_name)
    {
        this.game_name=game_name;
    }

    public String getDate_game() {
        return date_game;
    }
    public void setDate_game(String date_game){
        this.date_game=date_game;
    }

    public String getPlays() {
        return plays;
    }
    public void setPlays(String plays){
        this.plays=plays;
    }

    public String getMax_player_number() {
        return max_player_number;
    }
    public void setMax_player_number(String max_player_number){
        this.max_player_number=max_player_number;
    }

    public String getAbout_game() {
        return about_game;
    }
    public void setAbout_game(String about_game) {
        this.about_game = about_game;
    }

    public String getAuthor(){return author;}
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFirst_play() {
        return first_play;
    }
    public void setFirst_play(String first_play) {
        this.first_play = first_play;
    }

    public String getLast_play() {
        return last_play;
    }
    public void setLast_play(String last_play) {
        this.last_play = last_play;
    }

    public int getId_location() {
        return id_location;
    }
    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

}
