package com.mathmodel;

public class MathModel {

    public int[][] x;
    public int[] y;

    public int ObjectiveFcn(int[] a, int[] p, int[] s_min, int[] s_max, int[] w, int[] d, int k) {
        int w_sum = 0;

        int sum1 = 0,sum2 = 0,sum3 = 0;
        for (int i = 0, y_len = y.length; i < y_len; i++) {
            sum1 = sum1 + (a[i] * y[i]);

            sum2 = sum2 + (d[i] * k * s_min[i] * y[i]);

            for (int j = 0, x_len = x.length; j < x_len; j++) {
                w_sum = w_sum + w[j]*x[i][j];
            }

            sum3 = sum3 + (d[i] * k * w_sum / p[i] * (s_max[i] - s_min[i]) * y[i]);
        }

        return sum1 + sum2 + sum3;
    }

}
