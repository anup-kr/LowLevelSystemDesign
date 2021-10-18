package chess;
import lombok.Getter;

@Getter
public class Cell {
    private final int x;
    private final int y;
    private final Color color;
    private Piece piece;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        setCellColor();
    }
    protected setCellColor() {
        this.color = (getX() + getY()) % 2 == 0 ? Color.WHITE : Color.BLACK;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public void removePiece() {
        this.piece = null;
    }

    public boolean isEmpty() {
        return currentPiece == null;
    }
}