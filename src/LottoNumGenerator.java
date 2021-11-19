import java.util.Random;

public class LottoNumGenerator {
    Random random = new Random();
    LottoConstants lottoConstants = new LottoConstants();
    int lottoGameBuyCount;
    int lottoGameArrayLength = lottoConstants.lottoGameNumArray;
    int [] lottoGameResultArray = lottoConstants.lottoGameResultArray;
    int[][] lottoGameNumArray;


    public void setLottoGameBuyCount(int lottoGameBuyCount) {
        this.lottoGameBuyCount = lottoGameBuyCount;
    }

    public void setRandomLottoNum(){
        lottoGameNumArray = new int [lottoGameBuyCount][lottoGameArrayLength];
        for(int i=0; i<lottoGameNumArray.length; i++){
            for(int j=0; j<lottoGameNumArray[i].length; j++){
                lottoGameNumArray[i][j] = random.nextInt(45) + 1;
            }
        }

        for(int i=0; i<lottoGameResultArray.length; i++){
            lottoGameResultArray[i] = random.nextInt(45) + 1;
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
