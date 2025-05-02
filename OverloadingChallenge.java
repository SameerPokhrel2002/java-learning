public class OverloadingChallenge{
    public static void main(String[] args) {
        double centimeters = convertToCentimeters(10);
        System.out.println("10 inches in centimeters: " + centimeters);
        double feetAndInches = convertToCentimeters(5, 10);
        System.out.println("5 feet 10 inches in centimeters: " + feetAndInches);
    }
    public static double convertToCentimeters(double inches) {
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * 12) + inches;
        return convertToCentimeters(totalInches);
    }
}