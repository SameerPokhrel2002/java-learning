public class Time{
    public static void main(String[] args) {
        String result=getDurationString(-3945);
        System.out.println(result);
        System.out.println(getDurationString(65, 145));
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid value";
        }
        
            int minutes=seconds/60;
            int remainingSeconds=seconds%60;
            return getDurationString(minutes, remainingSeconds); //calling another method
            
        

       
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid value";
        }
        else{
            int hours=minutes/60;
        int remainingMinutes=minutes%60;
        int remainingSeconds=seconds%60;


        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }
       
    }
}