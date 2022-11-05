package CW_7;

public class Sentence {
    Word[] words;
    int len=0;
    char endChar = '.';

    Sentence() {}

    Sentence(Word[] s) {
        len = s.length;
        words = new Word[len];
        System.arraycopy(s, 0, words, 0, len);
    }

    Sentence(String s) {
        String[] str = s.split(" ");
        len = str.length;
        words = new Word[len];
        for (int i=0; i<len; i++) words[i] = new Word(str[i]);
    }

    public void append(Word w) {
        Word[] tmp = new Word[len + 1];
        if (len>0) System.arraycopy(words, 0, tmp, 0, len);
        tmp[len] = w;
        len++;
        words = new Word[len];
        System.arraycopy(tmp, 0, words, 0, len);
    }

    @Override
    public String toString() {
        String res = "";
        for (Word word : words) {
            res = String.join(" ", res, word.toString());
        }
        res = String.join("", res, Character.toString(endChar));
        return res;
    }

    public boolean equals(Sentence other) {
        if (len != other.len) return false;
        for (int i=0; i<len; i++) {
            if (!words[i].equals(other.words[i])) return false;
        }
        return true;
    }
}
