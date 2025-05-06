package com.dsa.arrays.greedy;

public class LemonadeChange {

    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        System.out.println(new LemonadeChange().lemonadeChange(bills));
    }

    public boolean lemonadeChange(int[] bills) {

        int fives = 0;
        int tens = 0;
        int twenty = 0;

        for (int amt : bills) {
            switch (amt) {
                case 5:
                    fives++;
                    break;

                case 10:
                    tens++;
                    if (fives > 0) {
                        fives -= 1;
                    } else {
                        return false;
                    }
                    break;

                case 20:
                    if (tens >= 1 && fives >= 1) {
                        tens--;
                        fives--;
                    } else if (fives >= 3) {
                        fives -= 3;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return true;

    }

}
