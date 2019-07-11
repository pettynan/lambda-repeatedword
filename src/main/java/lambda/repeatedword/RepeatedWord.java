package lambda.repeatedword;

// REGEX from https://stackoverflow.com/questions/11726023/split-string-into-individual-words-java

public class RepeatedWord {

    public static void main(String[] args) {
        System.out.println(repeatedWord("There once was a man who went there, where no man had ever gone before."));
    }

    public static String repeatedWord(String sentence) {
        HashTable hashTable = new HashTable(16);

        String[] words = sentence.split("\\W+");

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            if (hashTable.get(lowercaseWord) == null) {
                hashTable.add(lowercaseWord, lowercaseWord);
            } else {
                return word;
            }
        }

        return null;
    }
}
