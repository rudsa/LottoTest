import java.util.Random;
import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();

        Scanner scan = new Scanner(System.in);
        System.out.print("몇 게임 구매 하시겠어요?");
        int lottoGameBuyCnt = scan.nextInt();
        lottoNumGenerator.setLottoGameBuyCount(lottoGameBuyCnt);
        int [][] test = lottoNumGenerator.getLottoGameNumArray();
        for(int i=0; i<test.length; i++){
            for(int j=0; j<test[i].length; j++){
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }
}
