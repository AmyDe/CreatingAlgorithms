package com.example.creatingalgorithms;

import java.util.ArrayList;

public class Duplicates {

    public static void main(String[] args) {

    }

    public ArrayList<?> isDupe(int[] yourList) {
        ArrayList<Integer> dupedItems = new ArrayList<>();
        int wordIndex = 0;
        int arrLength = yourList.length;

        for (int n = 0; n < arrLength; n++) {

            for (int i = 1; i < arrLength; i++) {
                int nextWord = wordIndex+1;
                if (yourList[wordIndex] == yourList[nextWord]) {
                    dupedItems.add(yourList[wordIndex]);
                }
            }
            wordIndex++;
            arrLength -= 1;
        }
        return dupedItems;
    }
}



//        - Have list in front of me
//        - Have a second list titled ‘dupe words’. This has nothing else written.
//        - Start at the top of the list. Keep this word in mind/written down. Eg ‘Car’.
//        - Check if the subsequent word matches eg. Car and Book.
//        - If no match, do nothing and move on to the next word eg. ‘Phone’.
//        - Continue this until end of the list is reached.
//        - When the end is reached, move onto the next word eg ‘Book’.
//        - Repeat the process until end of list.
//        - Continue with this process until all comparisons made.
//        - If a match is found, check for occurrence on ‘dupe words’ list so that it is not added if already written there.
//        - Can return the list of duplicated words in which case the process is complete.
//        - If a true/false answer is desired instead, on first instance of a match, write true/yes down and stop process.



