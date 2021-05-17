public class Animal {
    private String name;

    public void run(int r) {
        System.out.println(name + " пробежал " + r + " метров ");
    }

    public void swim(int s) {
        System.out.println(name + " проплыл " + s + " метров ");
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}




public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int r) {
        if (r > 200) {
            System.out.println("Кот устал");
        } else {
            super.run(r);
        }
    }

    @Override
    public void swim(int s) {
        System.out.println("Кот не умеет плавать");
    }
}




public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int r) {
        if (r > 500) {
            System.out.println("Собака устала");
        } else {
            super.run(r);
        }
    }

    @Override
    public void swim(int s) {
        if (s > 10) {
            System.out.println("Собаку спасли спасатели");
        } else {
            super.swim(s);
        }
    }
}





public class LessonSIx {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Керри");
        dog1.run(250);
        dog1.swim(10);
        Cat cat1 = new Cat("Рокки");
        cat1.run(175);
        cat1.swim(20);
    }
}
