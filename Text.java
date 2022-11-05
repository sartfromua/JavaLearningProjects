package CW_7;

public class Text {
    Sentence[] sentences;
    int senNumber;
    String title;
    final int EDGE=40;

    public void append(Sentence w) {
        Sentence[] tmp = new Sentence[senNumber + 1];
        if (senNumber>0) System.arraycopy(sentences, 0, tmp, 0, senNumber);
        tmp[senNumber] = w;
        senNumber++;
        sentences = new Sentence[senNumber];
        System.arraycopy(tmp, 0, sentences, 0, senNumber);
    }

    public void print() {
        System.out.println("=========================================");

        for (int i=0; i<(EDGE-title.length())/2; i++) System.out.print(" ");
        System.out.print(title + "\n  ");

        int j = 0;
        for (Sentence sen: sentences) {
            String[] str = sen.toString().split(" ");
            for (String w: str) {
                j += str.length;
                System.out.print(w + " ");
                if (j >= EDGE) {
                    System.out.print("\n");
                    j = 0;
                }
            }
        }
        System.out.println("\n=========================================\n");
    }

    public boolean equals(Text other) {
        if (senNumber != other.senNumber) return false;
        for (int i=0; i<senNumber; i++) {
            if (!sentences[i].equals(other.sentences[i])) return false;
        }
        return true;
    }

}
