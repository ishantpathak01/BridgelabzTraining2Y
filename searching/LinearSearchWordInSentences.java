public class LinearSearchWordInSentences {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a programming language",
            "Linear search is simple",
            "Binary search needs sorted data"
        };
        System.out.println(findSentence(sentences, "search"));
        System.out.println(findSentence(sentences, "Python"));
    }
}
