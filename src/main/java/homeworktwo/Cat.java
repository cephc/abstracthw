package homeworktwo;

public class Cat extends Feline implements IPet {

    //constructors
    public Cat(){
    }
    public Cat(String name, int legs, boolean tail, boolean fur, boolean carnivore, boolean spots){
        super(name, legs, tail, fur, carnivore, spots);
    }
    //methods
    public String friendly() {
        return getName() + " I am trained by humans to be friendly to other humans and cats. ";
    }
    public String domesticated() {
        return getName() + " I am domesticated, I live in human houses instead of the wild. ";
    }

    public String interact() {
        return getName() + " I know how to interact with humans in a kind manner. ";
    }
    public String pur(){
        return getName() + " We pur when we are content. ";
    }
    public String howl(){
        return getName() + " We howl when we are in conflict. ";
    }
    public String eat(){
        return getName() + " We eat cooked beef, chicken, and turkey. ";
    }
    public String run(){
        return getName() + " We can run up to 30 mph! ";
    }
    public String sleep(){
        return getName() + " We enjoy sleeping...a lot! ";
    }
}
