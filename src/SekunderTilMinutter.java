import java.util.Scanner;

//https://github.com/SaneStreet/SekunderTilMinutter
//@SaneStreet
//Lavet d. 21-09-2017
//Programmering i 1. Semester
/*_________________________________________*/
public class SekunderTilMinutter {
    public static void main(String[] args) {
        //Scanner der spørger efter et input fra brugeren:
        System.out.print("Indtast antal sekunder: ");
        Scanner input = new Scanner(System.in);
        //Variablerne antalSekunder, minutterRes og sekunderRes:
        //antalSekunder er sekunder du indtaster.
        int antalSekunder = input.nextInt();
        //minutterRes er resultatet af de sekunder du indtaster som minutter.
        int minutterRes = antalSekunder / 60;
        //sekunderRes er de resterende sekunder, hvis der er nogle.
        int sekunderRes = antalSekunder % 60;
        //Udskriver resultatet i helhed.
        System.out.println("Det er " + minutterRes + " minutter og " + sekunderRes + " sekunder.");

    }
}
