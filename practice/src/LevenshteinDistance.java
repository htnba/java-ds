public class LevenshteinDistance {
    public int getDistance(String first, String second){
        /*
        the way to compute levenshtein distance is the minimum number of
        transformations that you can do to transform one string to the other
        lavenstein distance between two strings can be broken down further into
        subproblems as follows:
        iterate the two strings character by character
        if the two characters are the same then the distance is the same as that of the
        prefix
        if the characters are different then the distance is
        1+ min(ways to transform one string to the other)
        there are three ways to transform one string to the other
        1. delete a character from either of the strings
        2. change one character of a string to the other
        3. reverse of 2
        l[i-1][j]
        l[i][j-1]
        l[i-1][j-1] -> for the case where both of them are the same as well

        l[i-1][j-1] ->case when both are the same.
         */

        return 0;
    }
}
