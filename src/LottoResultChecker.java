public class LottoResultChecker {
    LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
    int [][] lottoGameNumArray = lottoNumGenerator.getLottoGameNumArray();
    int [] lottoGameResultArray = lottoNumGenerator.getLottoGameResultArray();
    int []lottoResult = new int [lottoGameNumArray.length];
    int resultCnt = 0;

    public int[] getLottoResult() {
        return lottoResult;
    }

    public void lottoResultChecker(){
        for(int i=0; i<lottoGameNumArray.length; i++){
            for(int j=0; j<lottoGameNumArray[i].length; j++){

            }
        }
    }
}
