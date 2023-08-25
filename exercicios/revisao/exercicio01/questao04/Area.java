public class Area {

    private int x;
    private int y;

    Area(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int area() {
        return Math.abs(x * y);
    }

    public void validar() {
        if (this.area() <= 0) {
            throw new RuntimeException("Área Inválida.");
        }
    }
}
