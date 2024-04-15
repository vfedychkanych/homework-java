package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyHomeworkObjects> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (i < 6) {
                Dog dog = new Dog("Navka", 10, "Pitbull");
                list.add(dog);
            }else if (i < 11) {
                Book book = new Book("Baobab", 123, "Drama");
                list.add(book);
            } else if(i < 16){
                Car car = new Car("VAZ", 345, 524, 2);
                list.add(car);
            } else if(i < 21){
                Posts posts = new Posts(1, i - 15, "DomHappy", "Its my bodyyyyy");
                list.add(posts);
            } else {
                Comments comments = new Comments(1, i - 20, "Super comment", "BABLCVAS@ukr.net", "Urugway and Yamayka!!!");
                list.add(comments);
            }

        }

        list.forEach(System.out::println);
    }
}
