import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //Task 1
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> even2 = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * n)
//                .toList();
//        System.out.println(even2);

    //Task 2
//        List<String> word = Arrays.asList("Et","Sud","Qatiq","Ip","Toyuq","Gulboreyi","Jagermaister","Qatiq");
//        List<String> word1 = word.stream()
//                .filter(n ->n.length()>3)
//                .distinct()
//                .sorted(Comparator.comparingInt(String::length)
//                .reversed())
//                .limit(3)
//                .toList();
//        System.out.println(word1);

    //Task 3
//        List<Employee> employees = Arrays.asList(
//                new Employee("Aysel", "IT", 3000, 28),
//                new Employee("Orxan", "IT", 4500, 35),
//                new Employee("Leyla", "HR", 2500, 32),
//                new Employee("Elvin", "Finance", 5000, 41),
//                new Employee("Nigar", "HR", 2800, 26),
//                new Employee("Rəşad", "Finance", 4200, 30)
//        );


    //Task 5
//        List<String> gmail = Arrays.asList(
//                "Turan@Gmail.com", "ulvi@yahoo.com", "turan@gmail.com",
//                "Ferid@GMAIL.COM", "senan@mail.ru", "Ilkin@gmail.com", "ferid@gmail.com"
//        );
//        long uniqueGmailCount = gmail.stream()
//                .map(String::toLowerCase)
//                .filter(n -> n.endsWith("@gmail.com"))
//                .distinct()
//                .count();
//        System.out.println(uniqueGmailCount);
    //Task 6
//        List<String> students = Arrays.asList("Aysel", "Orxan", "Leyla");
//        students.stream()
//                .map(name -> "Tələbə: " + name)
//                .forEach(System.out::println);

    //Task 7
//        List<Integer> number = Arrays.asList(5, 12, 8, 15, 20);
//        number.stream()
//                .filter(n -> n > 10)
//                .map(n -> "Ədəd: " + n)
//                .forEach(System.out::println);

    //Task 8
//        Map<String, Integer> grades = new LinkedHashMap<>();
//        grades.put("Riyaziyyat", 90);
//        grades.put("Fizika", 85);
//        grades.put("Kimya", 78);
//        grades
//                .forEach((key, value) ->
//                        System.out.println(key + " -> " + value));
    }
}