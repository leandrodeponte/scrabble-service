package br.com.scrabble.domain.player;

import br.com.scrabble.domain.board.Piece;

import java.util.List;

public class Player {
    private List<Piece> pieces;
    private int score;
    private PlayerStatus status;
}
