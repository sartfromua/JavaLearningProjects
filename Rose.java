package CW_8;

public class Rose extends Flower{
    Rose() {
        super(15, "Rose", "Rose odour", "red", 11, 20);
        this.color = "red";
        this.name = "Rose";
        this.odour = "Rose odour";
        this.price = 15;
    }

    Rose(int length) {
        super();
        this.color = "red";
        this.name = "Rose";
        this.odour = "Rose odour";
        this.price = 15;
        this.stemLenght = length;
    }
}
