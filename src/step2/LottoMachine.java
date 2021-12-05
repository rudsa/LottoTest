package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoMachine {
    public void startMachine(){
        System.out.println("Start Machine");
    }
    private int createRanNum(){
        Random randomNum = new Random();
        int lottonRandomNumber = randomNum.nextInt(45);

        List<Integer> randomLottoNum = new ArrayList<>();
        randomLottoNum.add(lottonRandomNumber);
        return 1;
    }
}
