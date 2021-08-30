package ex1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Hero implements Comparable, Serializable {

    String name;
    Long power;
    LocalDate dateOfbirth;
    String phoneNumber;

    public Hero(String name, Long power, LocalDate dateOfBirth, String phoneNumber) {
        this.name = name;
        this.power = power;
        this.dateOfbirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Object o) {
        Hero hero = (Hero) o;

        return getPower().compareTo(hero.getPower());

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}