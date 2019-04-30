public class Variables {
    public static void main(String[] args) {

        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 35;
        double height = 185.50;
        String pesel = "1234567890";

        /*System.out.println("Jan Kowalski ma 25 lat");
        System.out.println("PESEL Jana Kowalskiego to 1234567890" );
        System.out.println("Jan Kowalski ma 180 cm wzrostu");
        System.out.println("Jesli Jan urosnie o 5 cm bedzie mial 185 cm wzrostu");
        */
        System.out.println(firstName + " " + lastName + " ma " + age + " lat");
        System.out.println(firstName + " " + lastName + " ma " + height + " cm wzrostu");
        System.out.println("Jesli " + firstName + " urosnie o 5 cm  bedzie miał "+ (height+5) + " cm wzrostu" );


    }
}
