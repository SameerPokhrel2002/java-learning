public class Volkswagen {
    public static void main(String[] args) {
        String makeOfCar="Volkswagen";
        boolean isDomestic=(makeOfCar=="Volkswagen")?false:true;
        if(!isDomestic)
        {
            System.out.println("The make of Car is not domestic!");
        }

        int ageOfClient=20;
        String ageText=(ageOfClient>=18)?"Eighteen or Over Eighteen": "Still a kid";
        System.out.println("The client is "+ageText);
    }
}
