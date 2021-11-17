import java.util.Random;

public class LottoNumGenerator {
    LottoConstants lottoConstants = new LottoConstants();
    int []lottoGameArray = lottoConstants.lottoGameNumArray;

    Random random = new Random();

    public void setLottoGameArray(int[] lottoGameArray) {
        this.lottoGameArray = lottoGameArray;
    }

    public int[] getLottoGameArray() {
        for(int i=0; i<lottoGameArray.length; i++){
            lottoGameArray[i] = random.nextInt(45) + 1;
        }
        return lottoGameArray;
    }
}
