public class conTinh {
    private int x;
    private int y;

    public conTinh() {
    }

    public conTinh(int x, int y) {
        this.x = x;
        this.y = y;
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

    public boolean diChuyen(conTinh a, conTinh b) {
        if ((a.getX() + a.getY()) % 2 == (b.getX() + b.getY()) % 2) {
            return true;
        }
        return false;
    }
}
