package org.MH;

import org.MH.model.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamDemo {
    public static List<Person> createPersonList() {

        return Arrays.asList(
                new Person("Alice", "Johnsson", Gender.F, LocalDate.parse("1990-05-15"), true),
                new Person("Bob", "Smith", Gender.M, LocalDate.parse("1985-08-20"), false),
                new Person("Emily", "Davis", Gender.F, LocalDate.parse("1993-02-10"), true),
                new Person("John", "Doe", Gender.M, LocalDate.parse("1988-11-30"), false),
                new Person("Olivia", "Brown", Gender.F, LocalDate.parse("1987-04-25"), true),
                new Person("Michael", "Williams", Gender.M, LocalDate.parse("1991-09-05"), true),
                new Person("Sophia", "Martinez", Gender.F, LocalDate.parse("1989-07-12"), false),
                new Person("Daniel", "Johnson", Gender.M, LocalDate.parse("1995-03-18"), true),
                new Person("Ella", "Taylor", Gender.F, LocalDate.parse("1992-06-28"), false),
                new Person("William", "Anderson", Gender.M, LocalDate.parse("1986-12-03"), true),
                new Person("Ava", "Garcia", Gender.F, LocalDate.parse("1994-01-08"), false),
                new Person("Alexander", "Brown", Gender.M, LocalDate.parse("1984-10-17"), true),
                new Person("Charlotte", "Miller", Gender.F, LocalDate.parse("1990-08-22"), false),
                new Person("James", "Wilson", Gender.M, LocalDate.parse("1983-06-14"), true),
                new Person("Isabella", "Moore", Gender.F, LocalDate.parse("1988-04-07"), false)
        );
    }

    public static void main(String[] args) {
        List<Person> people = createPersonList();
        Predicate<Person> leapYear = person -> person.getBirthday().isLeapYear();

        people.
                stream()
                .filter(leapYear)
                .forEach(person -> System.out.println(person));
    }

}
