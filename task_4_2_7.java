package HW_6;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class task_4_2_7 {
    public static class Phone {
        private String id;
        private String surname, name, patronymic, address, card, debit, credit;
        int cityTime, interCityTime;

        public Phone() {}

        public Phone(String id, String surname, String name, String patronymic, String address,
                     String card, String debit, String credit, int cityTime, int interCityTime) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.address = address;
            this.card = card;
            this.debit = debit;
            this.credit = credit;
            this.cityTime = cityTime;
            this.interCityTime = interCityTime;
        }

        public Phone(String id, String surname, String name, int cityTime, int interCityTime) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.cityTime = cityTime;
            this.interCityTime = interCityTime;
        }

        public String getId() {
            return id;
        }

        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public String getAddress() {
            return address;
        }

        public String getCard() {
            return card;
        }

        public String getDebit() {
            return debit;
        }

        public String getCredit() {
            return credit;
        }

        public int getCityTime() {
            return cityTime;
        }

        public int getInterCityTime() {
            return interCityTime;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCard(String card) {
            this.card = card;
        }

        public void setDebit(String debit) {
            this.debit = debit;
        }

        public void setCredit(String credit) {
            this.credit = credit;
        }

        public void setCityTime(int cityTime) {
            this.cityTime = cityTime;
        }

        public void setInterCityTime(int interCityTime) {
            this.interCityTime = interCityTime;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + surname + "\nCity time: " + cityTime + "\nInterCity time: " + interCityTime;
        }
    }

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scan.nextInt();
        Phone[] dataBase = new Phone[n];
        for (int i=0; i<n; i++) {
            dataBase[i] = new Phone(Integer.toString(rand.nextInt(1,10000)),"Name"+(i+1), "Surname"+(i+1),
                    Math.max(0, rand.nextInt(-1000,1000)), Math.max(0, rand.nextInt(-1000,1000)));
        }
        System.out.print("Time limit of city calls = ");
        int cityLimit = scan.nextInt();
        System.out.println("People, who went over time limit of city calls:\n");
        for (Phone person: dataBase) {
            if (person.getCityTime() > cityLimit) System.out.println(person + "\n");
        }
        System.out.println("People, who used intercity calls:\n");
        for (Phone person: dataBase) {
            if (person.getInterCityTime() > 0) System.out.println(person + "\n");
        }

        System.out.println("All people in data base:\n");
        for (Phone person: dataBase) {
            System.out.println(person + "\n");
        }
    }
}
