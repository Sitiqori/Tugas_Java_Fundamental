public class CreatingVariables { 
    public static void main(String[] args) {
        int x, y, age;
        double seconds, e, checking;
        String firstname, lastname, title;

        x=10;
        y=400;
        age=39;

        seconds = 4.71;
        e = 2.71828182845904523530;
        checking = 1.89;

        firstname = "Graham";
        lastname = "Mitchell";
        title  = " Mr.";

        System.out.println("The variable x contains " + x); 
        System.out.println("The value " + y + " is stored in the variable y.");
        System.out.println("The experiment took " + seconds + "seconds."); 
        System.out.println("A favorite irritatinal # is Euler's number: " + e); 
        System.out.println("Hopefully you have more than $" + checking + " ! ");
        System.out.println("My name's " + title + " " + firstname + " " + lastname);
    }
}