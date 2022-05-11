package Animal;

public class Animal {
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    public Animal(boolean isDog) {
        this.isDog = isDog;
        this.name = "No name";
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    public String toString() {
        return this.name + (this.isDog ? " is a dog = true" : " is a dog = false");
    }
}
