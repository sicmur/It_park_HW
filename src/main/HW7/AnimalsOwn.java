package main.HW7;

class AnimalsOwn {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Tiger goodTiger = new Tiger();
        Cat myCat = new Cat();
        myCat.Cat("Мишка", 200, true);
        goodTiger.Tiger("Шархан", 900,100);
        myDog.Dog("Дружок", 500, 9);
        System.out.println("Про собаку");
        System.out.println(myDog.maxRun());
        System.out.println(myDog.maxSwim());
        System.out.println("---------------------------");
        System.out.println("Про тигра");
        System.out.println(goodTiger.maxRun());
        System.out.println(goodTiger.maxSwim());
        System.out.println("---------------------------");
        System.out.println("Про кошку");
        System.out.println(myCat.maxRun());
        System.out.println(myCat.maxSwim());
    }
}