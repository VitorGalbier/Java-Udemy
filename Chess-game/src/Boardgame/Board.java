package Boardgame;

public class Board {
    private int rows;
    private int columns;
    //matriz de peças
    private Piece [][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1){
            throw new BoardException("Error creating Board: there must be at least 1 row and 1 collumn");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int columns){
        if (!positionExist(row, columns)){
            throw new BoardException("Position is not on the board!");
        }
        return pieces[row][columns];
    }

    public Piece piece(Position position){
        if (!positionExist(position)){
            throw new BoardException("Position is not on the board!");
        }
        return pieces[position.getRow()][position.getCollumn()];
    }

    public void placePieces(Piece piece, Position position){
        if (thereIsPiece(position)){
            throw new BoardException("There is already a piece on position!");
        }
        pieces[position.getRow()][position.getCollumn()] = piece;
        //informando que a peça não está mais na posição inicial
        piece.position = position;
    }

    private boolean positionExist(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExist (Position position){
        return positionExist(position.getRow(), position.getCollumn());
    }

    public boolean thereIsPiece (Position position){
        //teste se a posição existe
        if (!positionExist(position)){
            throw new BoardException("Position is not on the board!");
        }
        return piece(position) != null;
    }
}
