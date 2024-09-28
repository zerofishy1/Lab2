public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {
        this.name = "Unnamed";
        this.age = 0;
        this.color = "colour";
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void makeSound();
    public abstract void move();
}

class Cat extends Animal {
    private boolean hasClaws;

    private static int catCount = 0;

    public Cat() {
        super();
        this.hasClaws = true;
        catCount++;
    }

    public Cat(String name, int age, String color, boolean hasClaws) {
        super(name, age, color);
        this.hasClaws = hasClaws;
        catCount++;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("Cat walks, runs, jumps.");
    }
}class Parrot extends Animal {
    private String favoritePhrase;

    public Parrot() {
        super();
        this.favoritePhrase = "Hello!";
    }

    public Parrot(String name, int age, String color, String favoritePhrase) {
        super(name, age, color);
        this.favoritePhrase = favoritePhrase;
    }

    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    public void setFavoritePhrase(String favoritePhrase) {
        this.favoritePhrase = favoritePhrase;
    }

    @Override
    public void makeSound() {
        System.out.println(favoritePhrase);
    }

    @Override
    public void move() {
        System.out.println("Parrot flies, jumps.");
    }
}

class Fish extends Animal {
    private String swimmingStyle;

    public Fish() {
        super();
        this.swimmingStyle = "Calm";
    }

    public Fish(String name, int age, String color, String swimmingStyle) {
        super(name, age, color);
        this.swimmingStyle = swimmingStyle;
    }

    public String getSwimmingStyle() {
        return swimmingStyle;
    }

    public void setSwimmingStyle(String swimmingStyle) {
        this.swimmingStyle = swimmingStyle;
    }

    @Override
    public void makeSound() {
        System.out.println("Blub-blub!");
    }

    @Override
    public void move() {
        System.out.println("Fish swims: " + swimmingStyle);
    }
}
class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5, "Gray", true);
        Parrot parrot1 = new Parrot("Kesha", 2, "Green", "Cock-a-doodle-doo!");
        Fish fish1 = new Fish("Nemo", 1, "Orange", "Fast");

        System.out.println("Cat:");
        System.out.println("Name: " + cat1.getName());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Has claws: " + cat1.isHasClaws());
        cat1.makeSound();
        cat1.move();

        System.out.println("\nParrot:");
        System.out.println("Name: " + parrot1.getName());
        System.out.println("Age: " + parrot1.getAge());
        System.out.println("Color: " + parrot1.getColor());
        System.out.println("Favorite phrase: " + parrot1.getFavoritePhrase());
        parrot1.makeSound();
        parrot1.move();

        System.out.println("\nFish:");
        System.out.println("Name: " + fish1.getName());
        System.out.println("Age: " + fish1.getAge());
        System.out.println("Color: " + fish1.getColor());
        System.out.println("Swimming style: " + fish1.getSwimmingStyle());
        fish1.makeSound();
        fish1.move();


        System.out.println("\nCats created: " + Cat.getCatCount());
    }
}