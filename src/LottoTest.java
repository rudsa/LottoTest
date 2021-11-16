import java.util.Scanner;

public class LottoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 게임 구매하시겠어요?");
        int lottoGameCount = scan.nextInt();
        switch (lottoGameCount){
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
