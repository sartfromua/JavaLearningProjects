package CW_7;

public class task_4_5_1 {
    public static void main(String[] args) {
        Sentence s1 = new Sentence();
        s1.append(new Word("Hello"));
        s1.append(new Word("everyone"));
        s1.endChar = '!';
        Sentence s2 = new Sentence("Today we're gonna have special guest");
        Sentence s3 = new Sentence("Greet him");
        s3.endChar = '!';
        Text t = new Text();
        t.append(s1);
        t.append(s2);
        t.append(s3);
        t.title = "Special guest";
        t.print();
    }
}
