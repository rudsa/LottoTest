import java.util.Random;
import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        int [] lottomNumArray = new int[6];

        Scanner scan = new Scanner(System.in);
        System.out.print("몇 게임 구매하시겠어요?");
        int buyGameCount = scan.nextInt();
        switch (buyGameCount){
            case 0 :
                System.out.println("게임을 종료합니다");
                break;
            case 1 :
                System.out.println("천원 입니다");
                break;
            case 2 :
                System.out.println("2천원 입니다");
                break;
            case 3 :
                System.out.println("3천원 입니다");
                break;
            case 4 :
                System.out.println("4천원 입니다");
                break;
            case 5 :
                System.out.println("5천원 입니다");
                break;
            default:
                System.out.println("5개 이상은 구매가 불가합니다");
                break;
        }
    }
}

class RandomNumTest{
    Random random = new Random();

    int [] lottoArray = new int[6];

    public void setLottoArray(int[] lottoArray) {
        for(int i=0; i<lottoArray.length; i++){
            int lottoNum = random.nextInt(45) + 1;
            this.lottoArray[i] = lottoNum;
        }
        this.lottoArray = lottoArray;
    }

    public int[] getLottoArray() {
        return this.lottoArray;
    }

}