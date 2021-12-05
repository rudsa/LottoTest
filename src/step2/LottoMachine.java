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
        randomNum.nextInt(45);
        List<String> randomLottoNum = new ArrayList<>();

        return 1;
    }
}
