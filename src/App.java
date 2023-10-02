
        import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        int[] fält1 = {8,4,6,3,9}; //Fältet
        System.out.println("Fält1: 1:a platsen="+fält1[0]); //Skriver ut fältets 1:a plats
        System.out.println("Fält1: 2:a platsen="+fält1[1]); //Skriver ut fältets 2:a plats
        System.out.println("Fält1: 5:e platsen="+fält1[4]);

        int fält1_summa = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]; //Summan av fältet
        int antalElement1 = fält1.length; //Så många tal arrayet inehåller
        System.out.println("Antal tal i fält1: "+antalElement1); // antalet rutor med tal i fält 1
        System.out.println("Medelvärdet på fält1: "+(double)fält1_summa/antalElement1); //Medelvärdet

        int[] fält2 = {18,14,16,13,19};
        double fält2_summa = fält2[0]+fält2[1]+fält2[2]+fält2[2]+fält2[4];
        int antalElement2 = fält2.length;
        System.out.println("Medelvärdet på fält2: "+(double)fält2_summa/antalElement2);

        double summafält = fält1_summa+fält2_summa;//, fält1[1]+fält2[1], fält1[2]+fält2[2], fält1[3]+fält2[3], fält1[4]+fält2[4];
        System.out.println("Summan av fält1+fält2:" +(double) summafält );
    }
}

