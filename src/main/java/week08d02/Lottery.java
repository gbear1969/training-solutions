package week08d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    ArrayList<Integer> numbersOfLottery =new ArrayList<>();

    public List<Integer> getNumbersOfLottery(int interval, int numbers) {
        Random random = new Random();
        while (numbersOfLottery.size() < numbers) {
            int n = random.nextInt(interval) + 1;
            if (!numbersOfLottery.contains(n)) {
                numbersOfLottery.add(n);
            }
        }
        Collections.sort(numbersOfLottery);
        return numbersOfLottery;
    }

    public List<Integer> getNumbersOfLotteryWithMath(int interval, int numbers) {
        while (numbersOfLottery.size() < numbers) {
            int n = (int) (Math.random() * interval + 1);
            if (!numbersOfLottery.contains(n)) {
                numbersOfLottery.add(n);
            }
        }
        Collections.sort(numbersOfLottery);
        return numbersOfLottery;
    }
}
