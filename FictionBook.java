package CW_8.task_4_7_1;

public class FictionBook extends Book{
    FictionBook () {
        super();
        theme = "Fiction";
    }

    @Override
    public void popular() {
        System.out.print("Book is so popular!");
    }
}
