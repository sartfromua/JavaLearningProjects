package CW_8;

public class Flower extends Item {
    String odour;
    String color;
    int fresh;
    int stemLenght;

    public Flower(int price, String name, String odour, String color, int fresh, int stemLenght) {
        super(price, name);
        this.odour = odour;
        this.color = color;
        this.fresh = fresh;
        this.stemLenght = stemLenght;
    }

    public Flower() {}

    public void setStemLenght(int stemLenght) {
        this.stemLenght = stemLenght;
    }

    public void setOdour(String odour) {
        this.odour = odour;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFresh(int fresh) {
        this.fresh = fresh;
    }

    public String getOdour() {
        return odour;
    }

    public String getColor() {
        return color;
    }

    public int getFresh() {
        return fresh;
    }

    public int getStemLenght() {
        return stemLenght;
    }

    public boolean longerStemThan(Flower other) {
        return this.stemLenght > other.stemLenght;
    }

    public Flower copy() {
        return new Flower(price, name, odour, color, fresh, stemLenght);
    }
}
