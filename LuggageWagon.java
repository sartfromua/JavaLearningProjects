package HW_8;

public class LuggageWagon extends Wagon{
    LuggageWagon() {
        passengers =0; comfortLevel=0;}

    LuggageWagon(int baggage) {
        super(0, 0, baggage);
    }
}
