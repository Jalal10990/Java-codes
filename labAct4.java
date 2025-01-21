public class labAct4 {
    public static void main(String[] args) {
        String sentence = "Now is the time for the birthday party";

        // Print the sentence and its length
        System.out.println("Sentence: " + sentence);
        System.out.println("Length of the sentence: " + sentence.length());

        // Access a specific character
        char characterAtIndex16 = sentence.charAt(16);
        System.out.println("Character at index 16: " + characterAtIndex16);

        // Find the index of a character and a substring
        int indexOft = sentence.indexOf('t');
        int indexOfFor = sentence.indexOf("for");
        System.out.println("Index of 't': " + indexOft);
        System.out.println("Index of 'for': " + indexOfFor);

        // Extract substrings
        String substring1 = sentence.substring(0, 6);
        String substring2 = sentence.substring(7, 12);
        String substring3 = sentence.substring(7, 22);
        String substring4 = sentence.substring(4, 10);
        System.out.println("Substring 1: " + substring1);
        System.out.println("Substring 2: " + substring2);
        System.out.println("Substring 3: " + substring3);
        System.out.println("Substring 4: " + substring4);

        // Convert to uppercase
        String uppercaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase sentence: " + uppercaseSentence);

        // Extract a substring based on an index
        int indexBirthday = sentence.indexOf("birthday");
        String birthdaySubstring = sentence.substring(indexBirthday, indexBirthday + 8);
        System.out.println("Birthday substring: " + birthdaySubstring);

        // Replace a character
        String replacedSentence = sentence.replace('t', 'T');
        System.out.println("Sentence with replaced 't': " + replacedSentence);
    }
}
