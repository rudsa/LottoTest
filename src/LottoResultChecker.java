public class LottoResultChecker {
    LottoNumGenerator lottoNumGenerator = new LottoNumGenerator();
    int lottoGameBuyCnt;
    int [][] lottoGameNumArray;
    int [] lottoGameResultArray;
    int []lottoResult;
    int resultCnt;

    public int[] getLottoResult() {
        return lottoResult;
    }

    public void lottoResultChecker(){
        lottoResult = new int[lottoGameBuyCnt];
        for(int i=0; i<lottoGameNumArray.length; i++){
            resultCnt = 0;
            for(int j=0; j<lottoGameNumArray[i].length; j++){
                for(int h=0; h<lottoGameResultArray.length-1; h++){
                    if(lottoGameNumArray[i][j] == lottoGameResultArray[h] ){
                        resultCnt++;
                    }
                }
                if(resultCnt == 5 && lottoGameNumArray[i][j] == lottoGameResultArray[lottoGameResultArray.length]){
                    resultCnt = 7;
                }
            }
            lottoResult[i] = resultCnt;
        }
        lottoRankChecker();
    }

    public void lottoRankChecker(){
        for(int i=0; i<lottoResult.length; i++){
            switch (lottoResult[i]){
                case 0,1,2:
                    lottoResult[i] = 0;
                    break;
                case 3:
                    lottoResult[i] = 5;
                    break;
                case 4:
                    lottoResult[i] = 4;
                    break;
                case 5:
                    lottoResult[i] = 3;
                    break;
                case 6:
                    lottoResult[i] = 1;
                    break;
                case 7:
                    lottoResult[i] = 2;
                    break;
                default:
                    break;
            }
        }
    }

    public int[] getLottoGameResultArray() {
        return lottoGameResultArray;
    }

    public int[][] getLottoGameNumArray() {
        return lottoGameNumArray;
    }

    public void setLottoGameBuyCnt(int lottoGameBuyCnt) {
        this.lottoGameBuyCnt = lottoGameBuyCnt;
    }

    public void setLottoGameNumArray(int[][] lottoGameNumArray) {
        this.lottoGameNumArray = lottoGameNumArray;
    }

    public void setLottoGameResultArray(int[] lottoGameResultArray) {
        this.lottoGameResultArray = lottoGameResultArray;
    }
}
