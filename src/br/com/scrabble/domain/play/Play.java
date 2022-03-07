package br.com.scrabble.domain.play;

import br.com.scrabble.domain.board.Piece;
import br.com.scrabble.domain.User;

import java.util.List;

public class Play {
    private int x;
    private char y;
    private List<Piece> píeces;
    private Direction direction;
    private User user;
    private int score;
    private PlayStatus status;
}
