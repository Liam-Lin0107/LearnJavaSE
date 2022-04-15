package com;


import java.util.Random;

public class Code01_MonteCarloSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        double rs = random.nextGaussian();
        System.out.println(rs);
    }
}
