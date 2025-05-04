public class StaticField {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.college);
        Student.college = "PU";
        System.out.println(s2.college);

    }
}
