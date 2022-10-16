
class Dog {

    String name;
    String say;

    Dog() {}
    Dog(String name, String say) {
        this.name = name;
        this.say = say;
    }

    void how() {
        System.out.println(say);
    }

    public boolean equals(Dog d) {
        return name.equals(d.name);
    }

}


public class task_2_1_6 {
    public static void main(String[] args) {
        Dog scruffy = new Dog("Scruffy", "Wurf");
        Dog spot = new Dog("Spot", "Ruff");
        scruffy.how();
        spot.how();

        Dog dog;
        dog = scruffy;
        dog.how();
        dog = spot;
        dog.how();

        if (dog == spot) {
            System.out.println("Same dogs");
        } else {
            System.out.println("Different dogs");
        }

        if (dog.equals(scruffy)) {
            System.out.println("Same dogs");
        } else {
            System.out.println("Different dogs");
        }
    }
}
