package CW_8;

public class Bouquet {
    int size;
    Flower[] flowers;
    int flowersNumber;
    String nameBouquet;

    void addFlower(Flower x) {
        flowers[flowersNumber++] = x;
    }

    void sortByStemLength() {
        for (int i=flowersNumber-1; i>0; i--) {
            while (flowers[i].longerStemThan(flowers[i+1])) {
                Flower tmp = flowers[i+1].copy();
                flowers[i+1] = flowers[i].copy();
                flowers[i] = tmp;
            }
        }
    }

    Bouquet() {
        flowers = new Flower[20];
        flowersNumber = 0;
    }

    Bouquet(int N) {
        flowers = new Flower[N];
        flowersNumber = 0;
    }


    public static void main(String[] args) {
        Bouquet bouq = new Bouquet();
        int n = 5;
        bouq.flowers = new Flower[n];
        bouq.flowers[0] = new Flower(6, "Dandelion", "odour", "yellow", 10, 20);
//        bouq.flowers[1] = new Flower();
//        bouq.flowers[1].setName("CW_8.Rose");
//        bouq.flowers[1].setStemLenght(30);
//        bouq.flowers[1].setColor("red");
//        bouq.flowers[1].setPrice(15);
//        bouq.flowers[1].setExpDate(new Date(2022, Calendar.DECEMBER, 2));
//        bouq.flowers[2] = new CW_8.Flower();
//        bouq.flowers[2].setName("Peony");
//        bouq.flowers[2].setStemLenght(25);
//        bouq.flowers[2].setColor("white");
//        bouq.flowers[2].setPrice(10);
//        bouq.flowers[2].setExpDate(new Date(2022, Calendar.NOVEMBER, 28));
        bouq.flowers[1] = new Rose();


    }
}
