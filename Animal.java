/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author 746897
 */
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String speak(){
        return name+" says "+sound();
    }
    public abstract String sound(); 
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public String sound(){
        return "wooof";
    }
}
class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "moooo";
    }
}
class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Hhheeiiighhh";
    }
}
class Sheep extends Animal{

    public Sheep(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "bbehhh";
    }
    
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "meaow";
    }
    
}