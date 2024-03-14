package com.satish.exp.jdk;

public class Java17 {
    static record Human(String name, int age, String job){};   // introduced on JDK 14
    static String switchPatterMatching(Object obj){
        return switch (obj) {
            case Human h -> "name: %s, age: %s and profession: %s".formatted(h.name, h.age, h.job);
            case String c -> "my name is circle: %s".formatted(c);
            case null -> "this is null man";
            default -> "nothing matched bud";
        };
    }

    public static void main(String[] args) {
        System.out.println(switchPatterMatching("atish"));
        System.out.println(switchPatterMatching(new Human("satish",12,"dev")));
        new Dog("tommy").bark();
        new Cat().bark();
    }
}

sealed interface Animal permits Cat, Dog{
    public void bark();
}

record Dog(String name) implements Animal{
    public void bark(){ System.out.println("i am Dog and my name is: %s".formatted(name) );};
}

final class Cat implements Animal{
    public void bark(){ System.out.println("i am Cat");};
}


