package step2;

import java.util.Scanner;

public class LottoStore {
    public static void main(String[] args) {
        System.out.println("어서오세요. 몇 게임 구매하시겠어요?");
        Scanner scan = new Scanner(System.in);
        int buyLottoGameCnt = scan.nextInt();
        System.out.println("안녕하세요 " + buyLottoGameCnt + "게임 주세요");
        System.out.println("네 알겠습니다. " + buyLottoGameCnt + "000원 입니다.");
        System.out.println("여기 있습니다.");
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.setBuyLottoGameCount(buyLottoGameCnt);
        lottoMachine.getGeneratorLottoRanNum();
        System.out.println("대박 기원하겠습니다.");
        LottoReceipt lottoReceipt = new LottoReceipt();
        System.out.println(lottoReceipt.toString());
        

    }
}
