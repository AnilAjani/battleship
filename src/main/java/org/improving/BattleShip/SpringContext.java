package org.improving.BattleShip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.Scanner;

    @Configuration
    @ComponentScan("org.improving.practice")

    public class SpringContext {
        @Bean
        public Scanner getScanner(){
            return new Scanner(System.in);
        }
        @Bean
        public Random getRandom(){
            return new Random();
        }
    }
