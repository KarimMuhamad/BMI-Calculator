import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Tinggi Badan : ");
        int tb = inp.nextInt();
        System.out.print("Berat Badan : ");
        int bb = inp.nextInt();
        System.out.print("Jenis Kelamin (l/p): ");
        String jk = inp.next();

        var bmi = bmiCalculator(tb,bb);
        String ket;
        if (bmi > 28.1) {
            ket = "Obesitas";
        } else if (bmi <= 28.1 && bmi > 23.1) {
            ket = "Overweight";
        } else if (bmi <= 23.1 && bmi > 18.1) {
            ket = "Normal";
        } else  {
            ket = "UnderWeight";
        }

        System.out.print("======Kalkulator Kesehatan======\n");
        System.out.printf("BMI = %.1f (%s)%n", bmi, ket);
        System.out.printf("Berat Badan Ideal Kamu = %.0f %n", beratIdeal(jk,tb));

    }

    private static double bmiCalculator(int tb, int bb) {
        var tSquare = Math.pow(( double)tb/100, 2);
        return bb / tSquare;
    }

    private static double beratIdeal(String jk, int tb) {
        switch (jk) {
            case "l" :
                return tb-100-((tb-100)*0.1);
            case "p" :
                return tb-100-((tb-100)*0.15);
            default:
                return 0;
        }
    }
}
