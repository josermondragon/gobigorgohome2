package com.games.gobigorgohome2.client;

import com.apps.util.Prompter;
import com.games.gobigorgohome2.Game;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Game app = new Game(new Prompter(new Scanner(System.in)));
        app.playGame();
    }
}