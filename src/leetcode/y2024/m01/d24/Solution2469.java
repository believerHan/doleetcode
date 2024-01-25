package leetcode.y2024.m01.d24;

import java.math.BigDecimal;

class Solution2469 {
    public static void main(String[] args) {
        System.out.println(0.0001+0.0002);
       // System.out.println(Arrays.toString(convertTemperature(36.50)));
    }
    public static double[] convertTemperature(double celsius) {
        BigDecimal kelvin = new BigDecimal(celsius).add(new BigDecimal(273.15));
        BigDecimal fahrenheit = new BigDecimal(celsius).multiply(new BigDecimal(1.80)).add(new BigDecimal(32));
        return new double[]{kelvin.doubleValue(),fahrenheit.doubleValue()};
    }
}