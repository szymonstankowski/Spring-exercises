package ex1.controller;

import ex1.Hero;
import ex1.HeroComponent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/add-hero")
public class ExamController {

    private final HeroComponent heroComponent;

    public ExamController(HeroComponent heroComponent){
        this.heroComponent=heroComponent;
    }



//    @GetMapping("/add-hero")
//    public String getForm(){
//        return "form";
//    }

    @PostMapping
    public Hero addHero(@RequestBody Hero hero){
        return heroComponent.addHero(hero);
    }

    @GetMapping
    public List<Hero> getHeroes(){
        return heroComponent.getHeroes();
    }



}
