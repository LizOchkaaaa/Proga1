package com.Hey;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        float[] x = new float[12];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) Math.round((Math.random() * 20) - 13.0);
        }
        double[][] t = new double[13][12];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++){
                if (a[i] == 16) {
                    t[i][j] = Math.cbrt(Math.cbrt(Math.log(abs(x[j]))));
                }else if (a[i] == 5 || a[i] == 8 || a[i] == 9 || a[i] == 10 || a[i] == 2 || a[i] == 14) {
                    t[i][j] = Math.pow((Math.log(Math.pow(E, x[j])) * (Math.log(3 * (4 + abs(x[j]))) + 0.25)), 3);
                }else {
                    t[i][j] = Math.pow((2+ (Math.pow(cos(atan(x[j]-3.5/19)), tan(Math.pow(0.5+x[j] , 2))) * (2/3 + tan(Math.pow((x[j]/PI), 2)))) /
                            sin(Math.log(2 * PI *(2 + abs(x[j]))))) , Math.pow( E , Math.pow(E , tan(x[j]))));
                }
            }
        }
        for(int i = 0; i < 13;i++){
            System.out.println();
            for(int j = 0; j < 12; j++){
                System.out.printf("%.5f",t[i][j]);
                System.out.print(" ");
            }
        }
    }
}
