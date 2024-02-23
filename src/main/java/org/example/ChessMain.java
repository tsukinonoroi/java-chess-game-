package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) {
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
        HashMap <String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);
    }



    public ArrayList<Player> createPlayers() {
        Player whitePlayer = new Player("Edem", "seytumerov@mail.ru", true,250, 20);
        Player blackPlayer = new Player("Fisher", "fisherchess@mail.ru",false, 3000, 40);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;

    }

    public HashMap<String, Piece> createPieces() {
        King whiteKing = new King(new Spot("h",7), "white_king", true);
        King blackKing = new King(new Spot("d",8), "black_king", false);
        Rook whiteRook1 = new Rook(new Spot("a",7),"white_rook1",true);
        Rook whiteRook2 = new Rook(new Spot("g",7),"white_rook2",true);
        Knight blackknight1 = new Knight(new Spot("d",6), "black_knight1", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackknight1.getId(), blackknight1);

        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap) {
        try {
            players.get(0).movePiece(hashMap.get("black_king"), new Spot("a", 8));
        }
        catch (IllegalArgumentException error) {
            System.out.println("The move is incorrect, please try again!!!!!!!!!!!!!");
        }
        players.get(1).movePiece(hashMap.get("black_knight1"), new Spot("c",8));
    }

}
