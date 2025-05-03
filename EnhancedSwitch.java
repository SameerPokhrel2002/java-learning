public class EnhancedSwitch {
    public static void main(String[] args) {
        int switchValue=4;
        switch(switchValue)
        {
            case 1->System.out.println("The value is 1.");
            case 2->System.out.println("The value is 2.");
            case 3->System.out.println("The value is 3.");
            default->System.out.println("The value is other than 1,2,3.");
        }

        //unlike traditional switch, enhanced switch can be used as an expression. Traditional switch was only a statement. Here's an example: 

        String day="thursday";
        String result=switch(day){
            case "sunday","monday","tuesday"->"Work Day!";
            case "saturday"->"Holiday";
            default->"Unknown";
        };
        System.out.println("Today is: "+result);
        String month="sunday";
        System.out.println(month +" is in "+ getQuarter(month)+" quarter.");
    }

    public static String getQuarter(String month)
    {
        return switch(month){
            case "january","february","march"->"1st";
            case "april","may","june"->"2nd";
            case "july","august","september"->"3rd";
            case "october","november","december"->"4th";
            default->{
                yield month+" is a bad month!!";
            }
        };
    }
}
