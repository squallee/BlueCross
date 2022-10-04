abstract public class Cord {
    public final Fan fan;

    protected Cord(Fan fan) {
        this.fan = fan;
    }

    abstract void pull();
}
