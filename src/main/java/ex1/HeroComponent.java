package ex1;

import jdk.internal.icu.text.UnicodeSet;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//            Utwórz komponent HeroComponent, zawierający listę obiektów typu Hero oraz dodatkową metodę: addHero(Hero hero)
//            - metoda ma dodawać obiekt Hero do listy w komponencie
//            Utwórz getter do pobrania listy.
//            Utwórz metodę o sygnaturze:


@Component
public class HeroComponent {

    private List<Hero> heroes = new ArrayList<>();

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public Optional<Hero> findHeroByPhoneNumber(String phoneNumber){
        return heroes.stream().filter(hero -> hero.getPhoneNumber().equals(phoneNumber)).findFirst();

    }





}
