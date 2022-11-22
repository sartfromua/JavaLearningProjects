package HW_9;

import java.util.ArrayList;

public class RecordBook {

    ArrayList<Session> sessions = new ArrayList<Session>();
    String name, surname;
    int course;
    String speciality;

    public RecordBook(String name, String surname, int course, String speciality) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.speciality = speciality;
    }

    public RecordBook() {}

    public boolean addSession(Session session) {
        return sessions.add(session);
    }

    public boolean addSession(int sessionNumber) {
        return sessions.add(new Session(sessionNumber));
    }

    public boolean addExamToSession(int sessionNumber, Exam exam) {
        for (Session ses: sessions) {
            if (ses.sessionNumber == sessionNumber) {
                ses.addExam(exam);
                return true;
            }
        }
        return false;
    }

    public boolean addExamToSession(int sessionNumber, String subject, String type, int mark) {
        for (Session ses: sessions) {
            if (ses.sessionNumber == sessionNumber) {
                ses.addExam(subject, type, mark);
                return true;
            }
        }
        return false;
    }

    public void printRecordBook() {
        System.out.println("Record book of student: "+name+" "+surname);
        System.out.println("Course: "+course+" Speciality: "+speciality);
        for (Session s: sessions) {
            s.printSession();
        }
    }

    public static class Session {
        ArrayList<Exam> exams = new ArrayList<Exam>();
        int sessionNumber;

        public boolean addExam(String subject, String type, int mark) {
            return exams.add(new Exam(subject, type, mark));
        }

        public boolean addExam(Exam ex) {
            return exams.add(ex);
        }

        public void printSession() {
            System.out.println("Session #"+sessionNumber);
            for (Exam ex: exams) {
                ex.printExam();
            }
        }

        Session(int sessionNumber) {
            this.sessionNumber = sessionNumber;
        }
    }

    public static class Exam {
        String type, subject;
        int date;
        int mark;

        public Exam(String subject, String type, int mark) {
            this.subject = subject;
            this.type = type;
            this.mark = mark;
        }

        public Exam() {}

        public void printExam() {
            System.out.println(subject + " - " + type + " - " + mark);
        }
    }


    public static void main(String[] args) {
        RecordBook book = new RecordBook("Bogdan", "Bakun", 3, "comp-math");
        book.addSession(1);
        Session ses = new Session(2);
        ses.addExam("programming", "ispyt", 100);
        Exam exam = new Exam("math analysis", "ispyt", 85);
        ses.addExam(exam);
        book.addSession(ses);
        book.addExamToSession(1, "algebra", "zalik", 96);
        book.printRecordBook();

    }
}
