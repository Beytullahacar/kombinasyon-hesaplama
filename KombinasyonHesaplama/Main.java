package KombinasyonHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int r = 4;
        int nSonuc = 1;
        int rSonuc = 1;
        int nrSonuc = 1;
        double kombinasyon;

        for (int i = 1; i<=n; i++){
            nSonuc *= i;
        }
        for (int k = 1; k<=r; k++){
            rSonuc *= k;
        }
        for (int j = 1; j<=(n-r); j++){
            nrSonuc *= j;
        }

        kombinasyon = nSonuc/(rSonuc*nrSonuc);

        System.out.println("C(n,r) = " + kombinasyon);


    }
}
