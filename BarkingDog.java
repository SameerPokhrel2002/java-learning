public class BarkingDog {
    public static void main(String[] args) {
        boolean wakeUp= shouldWakeUp(true,6 );
        System.out.println("Should wake up: " + wakeUp);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 0 || hourOfDay > 24)) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
    
}
