public class labtask6 {
    public static void main(String[] args) {
        String sentence = "Shah Jalal";
        int spaceIndex = sentence.indexOf(' ');

        String firstWord = sentence.substring(0, spaceIndex);
        String secondWord = sentence.substring(spaceIndex + 1);

        String swappedSentence = secondWord + " " + firstWord;

        System.out.println(swappedSentence);
    }
}
