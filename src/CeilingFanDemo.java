public class CeilingFanDemo {
    public static void main(String[] args) {
        // initialize a ceiling fan
        CeilingFan ceilingFan = new CeilingFan();
        // print out status
        System.out.println(ceilingFan);

        // pull speed cord
        ceilingFan.adjustSpeed();
        System.out.println(ceilingFan);
        // pull direction cord
        ceilingFan.adjustDirect();
        System.out.println(ceilingFan);
        // pull speed cord
        ceilingFan.adjustSpeed();
        System.out.println(ceilingFan);
        // pull speed cord
        ceilingFan.adjustSpeed();
        System.out.println(ceilingFan);
        // pull speed cord
        ceilingFan.adjustSpeed();
        System.out.println(ceilingFan);
    }
}
