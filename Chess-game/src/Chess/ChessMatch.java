package Chess;

import Boardgame.Board;
import Boardgame.Position;
import Chess.Pieces.King;
import Chess.Pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        //na hora que criar a partida, criam-se as peças
        initialSetUp();
    }

    public ChessPiece[][] getPieces (){
        ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    //Inicia a partida, colocando as peças no tabuleiro
    private void initialSetUp (){
        board.placePieces(new Rook(board, Color.WHITE), new Position(1, 2));
        board.placePieces(new King(board, Color.BLACK), new Position(4, 0));
    }
}
