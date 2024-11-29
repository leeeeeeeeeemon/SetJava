import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> numbers = new HashSet<>();

        // добавляем элементы в Set
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        System.out.println(numbers.add("one"));

        // вывод размера набора
        System.out.println("Размер набора: " + numbers.size());

        // проверяем наличие элементов в наборе
        System.out.println("Набор содержит 'one': " + numbers.contains("one"));
        System.out.println("Набор содержит 'four': " + numbers.contains("four"));

        // удаляем элемент из набора
        numbers.remove("three");

        // выводим все элементы набора
        for (String element : numbers) {
            System.out.println(element);
        }

        Set<String> nums = new TreeSet<>(Comparator.comparing(String::length));

        nums.add("um");
        nums.add("njnjn");
        nums.add("n");
        nums.add("");

        for (String element : nums) {
            System.out.println(element);
        }
    }
}

