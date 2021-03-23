public class BarkingDog {
    //Method that returns a value on whether the dog is barking or not
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //Checks if the time of day is between 0 - 23 hours
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if(((hourOfDay < 8 || hourOfDay > 22) && barking)){
            //Checks if the time is between 8 - 22 hours and if the dog is barking
            return true;
        }else {
            return false;
        }
    }
}
