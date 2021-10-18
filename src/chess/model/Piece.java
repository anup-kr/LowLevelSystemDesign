package chess;

public class Piece {
    private final Color color;
    private boolean isAlive;
    private PieceType pieceType;

    public Piece(Color color, PieceType pieceType, boolean isAlive) {
        this.color = color;
        this.pieceType = pieceType;
        this.isAlive = isAlive;
    }

    public Color getColor() {
        return this.color;
    }

    public PieceType getPieceType() {
        return this.pieceType;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isSamePlayerPiece(Piece otherPiece) {
        return this.color == otherPiece.color;
    }

}
