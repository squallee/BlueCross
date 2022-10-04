public class Fan {
    private boolean clockwise;
    private int speed;

    public Fan() {
        this.clockwise = true;
        this.speed = 0;
    }

    public boolean isClockwise() {
        return this.clockwise;
    }

    public void setClockwise() {
        this.clockwise = !this.clockwise;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed() {
        this.speed = (this.speed + 1) % 4;
    }
}
