package ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainHero {
    public static void main(String[] args) {

//        Utwórz klasę MainHero
//        W metodzie main utwórz listę obiektów typu Hero, a następnie przy pomocy strumieni:
//
//        - wybierz tylko tych bohaterów, których druga litera nazwy to u oraz ich moc jest większa od 5
//        - sortuj bohaterów pod względem mocy (domyślnie zostanie wykorzystana utworzona metoda z interfejsu)
//        - przekształć obiekty pobierając tylko ich nazwy
//        - przekształć nazwy, zostawiając z nich tylko pierwszą literę oraz zamieniaj litery na wielkie,
//        - zwróć przekształcone nazwy, połączone za pomocą znaku myślnika - w postaci jednego obiektu typu String
//
//        Wszystkie operacje wykonaj na jednym strumieniu. Przykładowy wynik:



        List<Hero> heroList = new ArrayList<>();


        heroList.add(new Hero("Superman", 100L, LocalDate.of(2021,8,31)));
        heroList.add(new Hero("Ironman", 85L, LocalDate.of(2021,8,31)));
        heroList.add(new Hero("Hulk", 90L, LocalDate.of(2021,8,31)));
        heroList.add(new Hero("spiderman", 6L, LocalDate.of(2001, 12,11)));
        heroList.add(new Hero("hubertman", 10l, LocalDate.of(2001, 12,11)));




        String collect = heroList.stream()
                //.filter(h -> h.getName().charAt(1) == 'u')
                .filter(hero -> hero.getName().matches(".[u][a-z]*"))
                .filter(hero -> hero.getPower()>5)
                .sorted()
                //.map(h -> h.getName().substring(o, 1).toUpperCase())
                .map(hero -> hero.getName())
                .map(n -> n.substring(0, 1))
                .map(n -> n.toUpperCase())
                .collect(Collectors.joining("-"));
        System.out.println(collect);

//        heroList.stream()
//                .forEach(hero -> System.out.println(hero.getName()));




    }
}

