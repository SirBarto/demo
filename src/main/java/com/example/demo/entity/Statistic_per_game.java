package com.example.demo.entity;

import org.springframework.data.annotation.Id;

public class Statistic_per_game{
    @Id
    int id;
    String game_name;
    String win_ratio;
    String plays;
    String average;
    String best;


}
