package HW4;
/*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        console();
    }
        private static void console () {
        LinkedList<String> inputLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srtFromCons;
        System.out.println("Введите значение для строки.\nДля выхода используйте 'print'.\nДля удаления предыдущей введенной строки используйте 'revert'");

        while (!(srtFromCons = scanner.nextLine()).equals("print"))
            inputLinkedList.addFirst(srtFromCons);

        scanner.close();

        System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());


        }
    }

// Если введено revert, удаляет предыдущую введенную строку из памяти. Не удаляет, не получилось, постараюсь доработать позже
