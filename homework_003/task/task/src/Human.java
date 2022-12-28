import java.io.Serializable;

public class Human implements Serializable, Comparable<Human> {
    private String family_status;
    private String surname;
    private String name_patronymic;
    private String pol;
    private int year_birth;

    public Human(String family_status, String surname, String name_patronymic, String pol, int year_birth){
        this.family_status = family_status;
        this.surname = surname;
        this.name_patronymic = name_patronymic;
        this.pol = pol;
        this.year_birth = year_birth;
    }

    public String getSurname() {
        return surname;
    }

    public String getName_patronymic() {
        return name_patronymic;
    }

    public String getPol() {
        return pol;
    }

    public int getYear_birth() {
        return year_birth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName_patronymic(String name_patronymic) {
        this.name_patronymic = name_patronymic;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public void setYear_birth(int year_birth) {
        this.year_birth = year_birth;
    }

    @Override
    public String toString(){
        return family_status+" - "+"фамилия-"+surname+", имя отчество - "+name_patronymic+", пол-"+pol+", год рождения-"+year_birth+"}\n";
    }

    @Override
    public int compareTo(Human o){
        return name_patronymic.compareTo(o.name_patronymic);
    }

}
