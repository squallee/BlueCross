public class DirectionCord extends Cord {
    public DirectionCord(Fan fan) {
        super(fan);
    }

    @Override
    void pull() {
        this.fan.setClockwise();
    }
}
