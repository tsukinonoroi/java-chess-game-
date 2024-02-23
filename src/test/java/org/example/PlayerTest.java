package org.example;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerTest {

    private static ArrayList<Player> players;

    @BeforeAll
    public static void setUp() {
        ChessMain main = new ChessMain();
        players = main.createPlayers();
    }

    @Test
    public void validEmail() {
        if (players.get(0).getEmail().contains("@") && players.get(0).getEmail().contains(".")) {
            System.out.println("All ok email is valid");
        } else {
            System.out.println("invalid email");
        }
    }

    @Test
    public void validName() {
        if (players.get(0).getName() == null || players.get(0).getName().isEmpty()) {
            System.out.println("invalid name lox");
        }
        else {
            System.out.println("All ok name is valid");
        }
    }
}

