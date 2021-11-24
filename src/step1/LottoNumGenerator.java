package step1;

import java.util.Random;

public class LottoNumGenerator {
    Random random = new Random();
    LottoConstants lottoConstants = new LottoConstants();
    int lottoGameBuyCount;
    int lottoGameArrayLength = lottoConstants.lottoGameNumArray;
    int [] lottoGameResultArray = new int[lottoConstants.lottoGameResultArray];
    int[][] lottoGameNumArray;


    public void setLottoGameBuyCount(int lottoGameBuyCount) {
        this.lottoGameBuyCount = lottoGameBuyCount;
    }

    public void generateRandomLottoNum(){
        lottoGameNumArray = new int [lottoGameBuyCount][lottoGameArrayLength];
        for(int i=0; i<lottoGameNumArray.length; i++){
            for(int j=0; j<lottoGameNumArray[i].length; j++){
                lottoGameNumArray[i][j] = random.nextInt(45) + 1;
                for(int h=0; h<j; h++){
                    if(lottoGameNumArray[i][j] == lottoGameNumArray[i][h]){
                        System.out.println("같은 숫자 발견");
                        j--;
                    }
                }
            }
        }

        for(int i=0; i<lottoGameResultArray.length; i++){
            lottoGameResultArray[i] = random.nextInt(45) + 1;
            for(int j=0; j<i; j++){
                if(lottoGameResultArray[i] == lottoGameResultArray[j]){
                    System.out.println("같은 숫자 발견");
                    i--;
                }
            }
        }
    }

    public int getLottoGameBuyCount() {
        return lottoGameBuyCount;
    }
    public int[][] getLottoGameNumArray() {
        return lottoGameNumArray;
    }

    public int[] getLottoGameResultArray() {
        return lottoGameResultArray;
    }
}
