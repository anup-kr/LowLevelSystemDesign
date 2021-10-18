package chess;

public class Player {
    private final String name;
    private final Color color;
    private

    public Player() {
        this.name = null;
    }
    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
