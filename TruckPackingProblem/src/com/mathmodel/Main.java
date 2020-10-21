package com.mathmodel;

public class Main {

    public static void main(String[] args) {
        System.out.println("BURN IN HELL !!!!");


        int k = 5;
        int[] a = {300, 150, 50};
        int[] p = {60, 40, 20};
        int[] s_min = {18, 12, 7};
        int[] s_max = {28, 17, 12};
        int[] w = {1, 4, 3, 2};
        int d = 5;

        int[][] x = {{1,1,0,0},
                     {0,0,1,1},
                     {0,0,0,0}};

        int[] y = {1,1,0};

        MathModel mathModel = new MathModel(x,y);
        int ans = mathModel.ObjectiveFcn(a, p, s_min, s_max, w, d, k);

        System.out.println(ans);
	// write your code here
    }
}
