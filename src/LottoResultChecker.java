public class LottoResultChecker {
    LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
    int[] lottoNumArray = lottoNumGenerator.getLottoGameArray();
    int[] lottoResultNumArray = lottoNumGenerator.getLottoGameResultArray();

    LottoTest lottoTest = new LottoTest();

    public static int lottoGameCnt;
    public static int lottoResult;

    public static void setLottoGameCnt(int lottoGameCnt) {
        LottoResultChecker.lottoGameCnt = lottoGameCnt;
    }

    public static int getLottoResult() {
        LottoNumGenerator [] lottoGameCntArray  = new LottoNumGenerator  [lottoGameCnt];
        for(int i=0; i<lottoGameCntArray.length; i++){
        }
        return lottoResult;
    }
}
