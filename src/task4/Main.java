package task4;

import lombok.Data;
import lombok.ToString;

import java.util.*;

enum Gender {
    MALE,
    FEMALE
}

class Skill {
    String title;
    int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return title + " (" + exp + " years)";
    }
}

class Car {
    String model;
    int year;
    int power;

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    @Override
    public String toString() {
        return model + " (" + year + ", " + power + " hp)";
    }
}

@Data
class Person {
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    List<Skill> skills;
    Car car;

    public Person(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    public int getSkillCount() {
        return skills.size();
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + gender + ", " + age + " years old) - " +
                "Skills: " + skills + ", Car: " + car;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(1, "John Doe", "johndoe", "johndoe@example.com", "123-456-7890", "johndoe.com", 30));
        userList.add(new User(2, "Jane Smith", "janesmith", "janesmith@example.com", "098-765-4321", "janesmith.com", 25));
        userList.add(new User(3, "Mike Johnson", "mikejohnson", "mikejohnson@example.com", "555-555-5555", "mikejohnson.com", 40));
        userList.add(new User(4, "Emily Davis", "emilydavis", "emilydavis@example.com", "111-222-3333", "emilydavis.com", 28));
        userList.add(new User(5, "Chris Brown", "chrisbrown", "chrisbrown@example.com", "444-555-6666", "chrisbrown.com", 35));
        userList.add(new User(6, "Jessica Wilson", "jessicawilson", "jessicawilson@example.com", "777-888-9999", "jessicawilson.com", 32));
        userList.add(new User(7, "David Martinez", "davidmartinez", "davidmartinez@example.com", "123-123-1234", "davidmartinez.com", 29));
        userList.add(new User(8, "Sarah Lee", "sarahlee", "sarahlee@example.com", "321-321-4321", "sarahlee.com", 26));
        userList.add(new User(9, "Daniel Hernandez", "danielhernandez", "danielhernandez@example.com", "654-654-7654", "danielhernandez.com", 33));
        userList.add(new User(10, "Laura Walker", "laurawalker", "laurawalker@example.com", "987-987-0987", "laurawalker.com", 31));

        //Створити List Юзерів
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

        userList.sort(Comparator.comparingInt(User::getAge));
        System.out.println(userList);
        userList.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println(userList);

        userList.sort(Comparator.comparingInt(value -> value.getName().length()));
        System.out.println(userList);
        userList.sort(Comparator.comparingInt( (User value) -> value.getName().length()).reversed());
        System.out.println(userList);

    //        створити ArrayList зі словами на 15-20 елементів.
    //        - відсортувати його за алфавітом .
        List<String> wordsList = new ArrayList<>();
        wordsList.add("apple");
        wordsList.add("banana");
        wordsList.add("cherry");
        wordsList.add("date");
        wordsList.add("elderberry");
        wordsList.add("fig");
        wordsList.add("grape");
        wordsList.add("honeydew");
        wordsList.add("kiwi");
        wordsList.add("lemon");
        wordsList.add("mango");
        wordsList.add("nectarine");
        wordsList.add("orange");
        wordsList.add("papaya");
        wordsList.add("quince");
        wordsList.add("raspberry");
        wordsList.add("strawberry");
        wordsList.add("tangerine");
        wordsList.add("ugli fruit");
        wordsList.add("watermelon");

        wordsList.sort(String::compareTo);
        System.out.println(wordsList);



        HashSet<Person> peopleSet = new HashSet<>();
        peopleSet.add(new Person(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE,
                Arrays.asList(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10)),
                new Car("Toyota", 2021, 250)));

        peopleSet.add(new Person(2, "Ivan", "Ivanov", "ivan@asd.com", 28, Gender.MALE,
                Arrays.asList(new Skill("python", 5), new Skill("html", 3)),
                new Car("Ford", 2019, 200)));

        peopleSet.add(new Person(3, "Olga", "Petrova", "olga@asd.com", 25, Gender.FEMALE,
                Arrays.asList(new Skill("java", 4), new Skill("js", 2)),
                new Car("BMW", 2022, 300)));
        peopleSet.add(new Person(4, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE,
                Arrays.asList(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10)),
                new Car("Toyota", 2021, 250)));

        peopleSet.add(new Person(5, "Ivan", "Ivanov", "ivan@asd.com", 28, Gender.MALE,
                Arrays.asList(new Skill("python", 5), new Skill("html", 3)),
                new Car("Ford", 2019, 200)));

        peopleSet.add(new Person(6, "Olga", "Petrova", "olga@asd.com", 25, Gender.FEMALE,
                Arrays.asList(new Skill("java", 4), new Skill("js", 2)),
                new Car("BMW", 2022, 300)));
        peopleSet.add(new Person(7, "Olga", "Petrova", "olga@asd.com", 25, Gender.FEMALE,
                Arrays.asList(new Skill("java", 4), new Skill("js", 2)),
                new Car("BMW", 2022, 300)));
        peopleSet.add(new Person(8, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE,
                Arrays.asList(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10)),
                new Car("Toyota", 2021, 250)));

        peopleSet.add(new Person(9, "Ivan", "Ivanov", "ivan@asd.com", 28, Gender.MALE,
                Arrays.asList(new Skill("python", 5), new Skill("html", 3)),
                new Car("Ford", 2019, 200)));

        peopleSet.add(new Person(10, "Olga", "Petrova", "olga@asd.com", 25, Gender.FEMALE,
                Arrays.asList(new Skill("java", 4), new Skill("js", 2)),
                new Car("BMW", 2022, 300)));



//        peopleSet.removeIf(p -> p.gender == Gender.MALE);
//
//        System.out.println("After removing males:");
//        for (Person person : peopleSet) {
//            System.out.println(person);
//        }


        Set<Person> peopleTreeSet = new TreeSet<>(Comparator.comparingInt(p -> p.skills.size()));
        peopleTreeSet.addAll(peopleSet);

        System.out.println("\nSorted by skill count:");
        for (Person person : peopleTreeSet) {
            System.out.println(person);
        }
    }
}

//        Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
@Data
class Pet{
    private String name;
    private Integer age;
}
@Data
@ToString
class Zooclub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    // 1) додати учасника в клуб;
    public void addPersonClub(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    // 2) додати тваринку до учасника клубу.
    public void addPetToPersonClub(Pet pet, Person person) {
        if (club.containsKey(person)) {
            club.get(person).add(pet);
        } else {
            System.out.println("Person is not in the club");
        }
    }

    // 3) видалити тваринку з власника.
    public void removePetFromPersonClub(Pet pet, Person person) {
        if (club.containsKey(person)) {
            club.get(person).remove(pet);
        } else {
            System.out.println("Person is not in the club");
        }
    }

    // 4) видалити учасника клубу.
    public void removePersonClub(Person person) {
        club.remove(person);
    }

    // 5) видалити конкретну тваринку з усіх власників.
    public void removePetFromAllPersons(Pet pet) {
        club.values().forEach(pets -> pets.remove(pet));
    }

    // 6) вивести на екран зооклуб.
    public void show() {
        club.forEach((person, pets) -> {
            System.out.println(person + " owns " + pets);
        });
    }
}

//        Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//        Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку