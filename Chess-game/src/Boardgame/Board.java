package Boardgame;

public class Board {
    private int rows;
    private int columns;
    //matriz de peças
    private Piece [][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int columns){
        return pieces[row][columns];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getCollumn()];
    }

    public void placePieces(Piece piece, Position position){
        pieces[position.getRow()][position.getCollumn()] = piece;
        //informando que a peça não está mais na posição inicial
        piece.position = position;
    }
}
