import java.util.Random;
import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
        LottoResultChecker lottoResultChecker = new LottoResultChecker();

        Scanner scan = new Scanner(System.in);
        System.out.print("몇 게임 구매 하시겠어요?");
        int lottoGameBuyCnt = scan.nextInt();
        lottoNumGenerator.setLottoGameBuyCount(lottoGameBuyCnt);
        lottoNumGenerator.setRandomLottoNum();
        lottoResultChecker.setLottoGameBuyCnt(lottoNumGenerator.getLottoGameBuyCount());
        lottoResultChecker.setLottoGameNumArray(lottoNumGenerator.getLottoGameNumArray());
        lottoResultChecker.setLottoGameResultArray(lottoNumGenerator.getLottoGameResultArray());
        lottoResultChecker.lottoResultChecker();
        for(int i=0; i<lottoResultChecker.getLottoResult().length; i++){
            System.out.print("buyNumber  ");
            for(int j=0; j<lottoResultChecker.getLottoGameNumArray()[i].length; j++){
                System.out.print(lottoResultChecker.getLottoGameNumArray()[i][j] + " ");
            }
            System.out.println(lottoResultChecker.getLottoResult()[i]);
        };
        for(int i=0; i<lottoResultChecker.getLottoGameResultArray().length; i++){
            System.out.print(lottoResultChecker.getLottoGameResultArray()[i] + " ");
        }
    }
}
