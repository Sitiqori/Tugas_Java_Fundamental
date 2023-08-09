import java.util.Scanner;
   
public class CafeReservation{
    public static void main(String[] args) {
        String name, gender, day, result;
        int age;
        double attractive, money;

        Scanner input = new Scanner(System.in);

        result = "";

        System.out.println("Welcom to Reservation Cafe.\n");

        System.out.println ("Please insert your name:"); 
        name = input.nextLine();

        System.out.println ("How old are you?");
        age = input.nextInt();

        System.out.println ("What is your gender? (Male/Female)");
        gender = input.next();

        System.out.println ("How attractive are you? (1-10)");
        attractive = input.nextDouble();

        System.out.println ("How much money do you have?");
        money = input.nextDouble();

        System.out.println ("What day do you want to make a reservation?");
        day = input.next();

        if(day.equalsIgnoreCase("Monday")){
            if(age >= 20 && age <= 30 && money >= 500){
                result = "Reservation Succesfully, You can order on Monday. Young Night";
            }else {
                result = "Sorry, you can't order on Monday!, Cause it is for young night.";
            }
        }else if(day.equalsIgnoreCase("Tuesday")){
            if(age >= 31 && age <= 50 && money >=250 ){
                result = "Reservation Succesfully, You can order on Tuesday. Oldest Night";
            }else {
                result = "Sorry, you can't order on Tuesday!, Cause it is for Oldest night.";
            }
       }else if(day.equalsIgnoreCase("Wednesday")){
            if(gender.equalsIgnoreCase("Female") && age >= 20 && age <= 35 && money >=300 && attractive >= 8 ){
                result = "Reservation Succesfully, You can order on Wednesday. Ladies Night";
            }else {
                result = "Sorry, you can't order on Wednesday!, Cause it is for Ladies night.";
            }
        }else if(day.equalsIgnoreCase("Thrusday")){
            if(gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && money >=300 && attractive >= 8 ){
                result = "Reservation Succesfully, You can order on Thrusday. Party Night for Single";}
            if(gender.equalsIgnoreCase("Male") && age >= 21 && age <= 30 && money >=1000 ){
                result = "Reservation Succesfully, You can order on Thrusday. Party Night for Single";
            }else {
                result = "Sorry, you can't order on Thrusday!, Cause it is for Party Night for Single.";
            }
        }else if(day.equalsIgnoreCase("Friday")){
            if(gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >=1000 ){
                result = "Reservation Succesfully, You can order on Friday. Woman Night";}
            if(gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && attractive >= 8 ){
                result = "Reservation Succesfully, You can order on Friday. Woman Night";
            }else {
                result = "Sorry, you can't order on Friday!, Cause it is for Woman Night.";
            }
        }else if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            if( age >= 18 && age <= 60 && money >=100 ){
                result = "Reservation Succesfully, You can order on Weekdays. Weekend Freedom";
            }else {
                result = "Sorry, you can't order on Weekdays!, Cause it is for Weekend Freedom.";
            }
        }



        System.out.println();
        System.out.println("Hai " + name + "Thanks for using our App");
        System.out.println("Following Result for your Reservation");
        System.out.println(result);

       
    }
}     
