package xotiv.com.comman;

import java.util.ArrayList;
import java.util.List;

public class Program {
        public static void main(String[] args) {
//            MultiplicationTable();
//            stringReverse();
//            reverseString();
//            reverseWords();
              duplicateNumber();

        }

        public static void duplicateNumber() {

            List numberList = new ArrayList<>();

            // Add numbers to the list, including duplicates
            numberList.add(1);
            numberList.add(2);
            numberList.add(3);
            numberList.add(2); // Duplicate
            numberList.add(4);
            numberList.add(5);
            numberList.add(3); // Duplicate
            numberList.add(1); // Duplicate

            System.out.println("List with duplicates: " + numberList);
        }

    public static void m1(){
            int n = 1;
            for (int i = 5; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(n);
                    n++;
                }
                System.out.print(" ");

        }
    }

        public static void MultiplicationTable(){
            int max = 10; // Define the maximum number for the table
            // Print column headers
            System.out.print("      "); // For alignment
            for (int i = 1; i <= max; i++) {
                System.out.printf("%4d", i);

                System.out.println();
                System.out.printf("%4d", i); // Print row header
                for (int j = 1; j <= max; j++) {
                    System.out.printf("%4d", i * j); // Print the table cell
                }
                System.out.println(); // Move to the next line after each row
        }
    }
         public static void stringReverse() {
             String original = "Vikesh";
             char[] chars = original.toCharArray();
             int left = 0;
             int right = chars.length - 1;

             while (left < right) {
                 char temp = chars[left];
                 chars[left] = chars[right];
                 chars[right] = temp;
                 left++;
                 right--;
             }
             String reversed = new String(chars);
             System.out.println("Original: " + original);
             System.out.println("Reversed: " + reversed);
         }

        public static void reverseString() {
            String original = "Vikesh";
            String reversed = new StringBuilder(original).reverse().toString();
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);

    }
        public static void reverseWords() {
            String sentence = "Hello Vikesh Ravi";
            String[] words = sentence.split(" "); // Split the sentence into words
            StringBuilder reversedSentence = new StringBuilder();
            // Process each word
            for (String word : words) {
                String reversedWord = new StringBuilder(word).reverse().toString(); // Reverse the word
                reversedSentence.append(reversedWord).append(" "); // Append the reversed word and a space
            }
            // Remove the trailing space and print the result
            System.out.println("Original: " + sentence);
            System.out.println("Reversed Words: " + reversedSentence.toString().trim());

    }

}
