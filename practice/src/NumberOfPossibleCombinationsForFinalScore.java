import java.util.ArrayList;
import java.util.List;

public class NumberOfPossibleCombinationsForFinalScore {
    public static void main(String ... args){
        //given an array of possible scores and a total score,
        //find the total number of combinations using which the
        //final score is reachable
        int finalScore = 12;
        List<Integer> possibleScores = new ArrayList<>();
        possibleScores.add(2);
        possibleScores.add(3);
        possibleScores.add(7);

        //initialize an array that has number of rows = possibleScores' length

        getPossibleCombinations(finalScore, possibleScores);
    }

    private static void getPossibleCombinations(int finalScore, List<Integer> possibleScores) {
        int[][] possibleCombinationsMap = new int[possibleScores.size()][finalScore+1];

        //iterate over these arrays in the following manner -> iterate the possible
        //scores first and then the ways to make the desired score
        for(int i=0;i<possibleScores.size();i++){
            int scoreInQuestion = possibleScores.get(i);
            possibleCombinationsMap[i][0] = 1; // there is exactly one way to get a final score of 0
            //which is getting a 0 every time!
            for(int j=1;j<=finalScore;j++){
                int withoutThisScore = i-1>=0 ? possibleCombinationsMap[i-1][j] : 0;
                int withThisScore = j>=scoreInQuestion ? possibleCombinationsMap[i][j-scoreInQuestion] : 0;
                possibleCombinationsMap[i][j] = withoutThisScore + withThisScore;
            }
        }
        System.out.println(possibleCombinationsMap[possibleScores.size()-1][finalScore]);
    }
}
