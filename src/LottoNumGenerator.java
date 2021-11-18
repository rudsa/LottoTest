import java.util.Random;

public class LottoNumGenerator {
    Random random = new Random();
    LottoConstants lottoConstants = new LottoConstants();
    int lottoGameBuyCount;
    int lottoGameArrayLength = lottoConstants.lottoGameNumArray;
    int[][] lottoGameNumArray;


    public void setLottoGameBuyCount(int lottoGameBuyCount) {
        this.lottoGameBuyCount = lottoGameBuyCount;
    }


}
