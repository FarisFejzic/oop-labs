package org.example.people;

public class Person {
    private String name;
    private String address;
    int age;
    String country;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Person(String name, String address,int age, String country) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return name + "\n     " + address;
    }

    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
    }

}

