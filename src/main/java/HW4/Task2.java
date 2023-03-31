package HW4;
/*Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.*/
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        RandomList();
        toys();
    }

    private static void RandomList() {
        Random random = new Random();
        List<Integer> randomLinkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            randomLinkedList.add(random.nextInt(1, 10));
        }

        System.out.println("Случайный список: " + randomLinkedList.toString());

        List<Integer> RevertLinkedList = new LinkedList<>();

        for (int i = randomLinkedList.size() - 1; i >= 0; i--) {
            RevertLinkedList.add(randomLinkedList.get(i));
        }

        System.out.println("Перевёрнутый список: " + RevertLinkedList.toString());

    }

    private static void toys() {
        LinkedList<String> Toy = new LinkedList<>();
        Toy.add("Кукла");
        Toy.add("Собака");
        Toy.add("Мяч");
        Toy.add("Машинка");
        Toy.add("Коляска");
        Toy.add("Мишка");
        System.out.println("Список игрушек: " + Toy);

        LinkedList<String> RevertToy = new LinkedList<>();
        for (int i = Toy.size() - 1; i >= 0; i--) {
            RevertToy.add(Toy.get(i));
        }
        System.err.println("Список игрушек в обратном порядке: " + RevertToy);
    }
}
