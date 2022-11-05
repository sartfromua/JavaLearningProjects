package CW_7;

public class Word {
    String word;

    Word(String w) {word = w;}

    Word() {}

    @Override
    public String toString() {
        return word;
    }

    public boolean equals(Word other) {
        return word.equals(other.word);
    }

}
