package chess;

public class ChessBoard {
    int boardSize;
    Cell[][] cells;

    public ChessBoard(int boardSize, Cells[][] cells) {
        this.boardSize = boardSize;
        this.cells = cells;
    }
    public Cell getCellAtLocation(int x, int y) {
        if(x >= 0 && x < boardSize && y >= 0 && y < boardSize) {
            return cells[y][x];
        }
        return null;
    }
    public resetBoard() {
        // clear all cells first
        for(int y = 0; y < boardSize; y++) {
            for(int x = 0; x < boardSize; x++) {
                getCellAtLocation(x, y).removePiece();
            }
        }
        // set the pawns rows
        for(int y=1, x=0; x < boardSize; x++) {
            getCellAtLocation(x, y).setPiece(new Piece(Color.BLACK, PieceType.PAWN, true));
            getCellAtLocation(x, boardSize-2).setPiece(new Piece(Color.WHITE, PieceType.PAWN, true));
        }
        // set the Queen's row
        getCellAtLocation(0, 0).setPiece(new Piece(Color.BLACK, PieceType.BISHOP, true));
        getCellAtLocation(, 0).setPiece(new Piece(Color.BLACK, PieceType.BISHOP, true));
    }
}
