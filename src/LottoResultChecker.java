public class LottoResultChecker {
    LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
    int[] lottoNumArray = lottoNumGenerator.getLottoGameArray();
    int[] lottoResultNumArray = lottoNumGenerator.getLottoGameResultArray();

    LottoTest lottoTest = new LottoTest();

    public int[] getLottoNumArray() {
        return lottoNumArray;
    }

    public int[] getLottoResultNumArray() {
        return lottoResultNumArray;
    }
}
