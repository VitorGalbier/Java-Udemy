package Boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //nao precisa colocar
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
