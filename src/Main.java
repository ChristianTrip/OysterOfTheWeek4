import java.util.ArrayList;

public class Main {

    /*
    Oyster Of The Week - 4. Challenge
        Made by: Christian Trip, DAT21A
     */

    public static ArrayList<Integer> getStartingIndecies(String word, String pattern){

        ArrayList<Integer> startingIndecies = new ArrayList<>();

        int wordLength = word.length();
        int patternLength = pattern.length();

        for (int startIndex = 0; startIndex <= (wordLength - patternLength); startIndex++) {
            String substring = word.substring(startIndex, (startIndex + patternLength));
            if (substring.equals(pattern)){
                startingIndecies.add(startIndex);
            }
        }
        return startingIndecies;
    }

    public static void main(String[] args) {

        String word = "abracadabra";
        String pattern = "abr";
        ArrayList<Integer> startingIndecies = getStartingIndecies(word, pattern);

        System.out.println(startingIndecies);

    }
}
