package JavaBasics.TypeConversion.precisionLoss;

import java.util.Scanner;

public class precisionLoss {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 16, 2024
         * Time: 04:56:00 PM
         */

        // Variables
        double PI = 3.141592653589793;
        float shortPI;

        // Conditions
        shortPI = (float) PI; // Explicit narrowing

        System.out.println("Original (double) : " + PI);
        System.out.println("Loss (float)      : " + shortPI);

    }
}
