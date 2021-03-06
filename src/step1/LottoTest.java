package step1;

import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("몇 게임 구매 하시겠어요?");
        int lottoGameBuyCnt = scan.nextInt();
        LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
        lottoNumGenerator.setLottoGameBuyCount(lottoGameBuyCnt);
        lottoNumGenerator.generateRandomLottoNum();
        LottoResultChecker lottoResultChecker = new LottoResultChecker();
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
        System.out.print("Result Num ");
        for(int i=0; i<lottoResultChecker.getLottoGameResultArray().length; i++){
            System.out.print(lottoResultChecker.getLottoGameResultArray()[i] + " ");
        }
    }
}
