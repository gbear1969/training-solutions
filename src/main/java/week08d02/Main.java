package week08d02;

import java.util.Collections;
import java.util.SortedSet;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Lottery lotteryM = new Lottery();
        System.out.println("Az alábbi lottószámokat sorsoltuk ki:");
        System.out.println(lottery.getNumbersOfLottery(90, 5));
        System.out.println(lotteryM.getNumbersOfLotteryWithMath(45, 5));
    }

}
