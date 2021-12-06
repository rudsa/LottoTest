package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoMachine {
    private int buyLottoGameCount;
    public void startMachine(){
        System.out.println("Start Machine");
    }

    private List<Integer> generatorLottoRanNum(){
        boolean flag = true;
        Random lottoRanNum = new Random();
        List<Integer> randomLottoNumArray = new ArrayList<>();
        while(flag) {
            randomLottoNumArray.add(lottoRanNum.nextInt(45));
            flag = randomLottoNumArray.size() < 6 ? true: false;
        }
        return randomLottoNumArray;
    }

    private List<List<Integer>> createLottoArray(){
        boolean flag = true;
        List<List<Integer>> lottoArray = new ArrayList<>();
        while (flag){
            lottoArray.add(getGeneratorLottoRanNum());
//            flage
        }
        return lottoArray;
    }

    public void setBuyLottoGameCount(int buyLottoGameCount) {
        this.buyLottoGameCount = buyLottoGameCount;
    }

    public List<Integer>getGeneratorLottoRanNum(){
        return generatorLottoRanNum();
    }
}
