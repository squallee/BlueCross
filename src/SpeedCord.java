public class SpeedCord extends Cord {
    public SpeedCord(Fan fan) {
        super(fan);
    }

    @Override
    void pull() {
        this.fan.setSpeed();
    }
}
