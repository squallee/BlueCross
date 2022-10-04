//In Java,  implement a simple ceiling fan with these characteristics:
//        •    The unit has 2 pull cords:   One increases the speed each time it is pulled.
//        There are 3 speed settings, and an “off” (speed 0) setting.
//        If the cord is pulled on speed 3, the fan returns to the “off” setting.
//        One reverses the direction of the fan at the current speed setting.
//        Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
//        •    You can assume the unit is always powered (no wall switch)
//
//        Assessment format: Please provide your project via a link to your public code repository.

public class CeilingFan {
    private final Fan fan;
    private final DirectionCord directionCord;
    private final SpeedCord speedCord;

    public CeilingFan() {
        fan = new Fan();
        directionCord = new DirectionCord(fan);
        speedCord = new SpeedCord(fan);
    }

    public void adjustSpeed() {
        speedCord.pull();
    }

    public void adjustDirect() {
        directionCord.pull();
    }

    @Override
    public String toString() {
        return "Fan speed is : " + fan.getSpeed() + ", Fan direction clockwise: " + fan.isClockwise();
    }
}
