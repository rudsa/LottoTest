import java.util.Random;
import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
        int[] randomLottoNumArray = lottoNumGenerator.getLottoGameArray();

        LottoResultChecker lottoResultChecker = new LottoResultChecker();

        Scanner scan = new Scanner(System.in);
        System.out.print("몇 게임 구매 하시겠어요?");
        int lottoGameBuyCnt = scan.nextInt();

        lottoResultChecker.setLottoGameCnt(lottoGameBuyCnt);

        lottoResultChecker.getLottoResult();
//        switch (lottoGameBuyCnt){
//            case 0:
//                System.out.println("구매하지 않으시는군요");
//                break;
//            case 1:
//                System.out.println("네 1 게임 천원 입니다");
//                break;
//            case 2:
//                System.out.println("네 2 게임 이천원 입니다");
//                break;
//            case 3:
//                System.out.println("네 3 게임 삼천원 입니다");
//                break;
//            case 4:
//                System.out.println("네 4 게임 사천원 입니다");
//                break;
//            case 5:
//                System.out.println("네 5 게임 오천원 입니다");
//                break;
//        }
    }
}
