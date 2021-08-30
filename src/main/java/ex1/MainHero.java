package ex1;

import org.springframework.cglib.core.Local;
import org.springframework.format.datetime.joda.LocalDateParser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainHero {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        List<Hero> list = new ArrayList<>();

        list.add(new Hero("Superman", 100L, localDate, "123456"));
        list.add(new Hero("Ironman", 85L, localDate, "0987"));
        list.add(new Hero("Hulk", 90L, localDate, "1234567"));


        list.stream()
                .filter(hero -> hero.getName().matches(".[u][a-z]*") && hero.getPower() > 5L)
                .sorted()
                .forEach(hero -> System.out.println(hero.getName()+" "+hero.getPower()));

//        list.stream()
//                .forEach(hero -> System.out.println(hero.getName()));


    }
}

