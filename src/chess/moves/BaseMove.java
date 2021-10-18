package chess.moves;

public abstract class BaseMove {
    public boolean canMove(Cell fromCell, Cell toCell) {
        Piece pieceToMove = fromCell.getCurrentPiece();
        if(!toCell.isEmpty() && pieceToMove.isSamePlayerPiece(toCell.getCurrentPiece())) {
            return false;
        }
    }

}