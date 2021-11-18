public class LottoResultChecker {
    LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
    int [][] lottoGameNumArray;
    int [] lottoGameResultArray;
    int []lottoResult;
    int resultCnt;

    public int[] getLottoResult() {
        return lottoResult;
    }

    public void lottoResultChecker(){
        for(int i=0; i<lottoGameNumArray.length; i++){
            resultCnt = 0;
            for(int j=0; j<lottoGameNumArray[i].length; j++){
                for(int h=0; h<lottoGameResultArray.length; h++){
                    if(lottoGameNumArray[i][j] == lottoGameResultArray[h] ){
                        resultCnt++;
                    }
                }
            }
            lottoResult[i] = resultCnt;
        }
    }
}
