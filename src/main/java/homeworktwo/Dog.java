package homeworktwo;

public class Dog extends Canine implements IPet {

    //constructors
    public Dog(){
    }
    public Dog(String name, int legs, boolean fur, boolean tail, int paws, boolean sharpTeeth){
        super(name, legs, fur, tail, paws, sharpTeeth);
    }
    //methods
    public String taste(){
        return getName() + "We have an acute sense of taste. ";
    }
    public String smell(){
        return getName() + "We have a great sense of smell. ";
    }
    public String eat(){
        return getName() + "We are carnivorous, but we also eat plant-based foods. ";
    }
    public String run(){
        return getName() + "We can run up to 45 mph. ";
    }
    public String sleep(){
        return getName() + " We sleep 12 to 14 hours a day. ";
    }
    public String friendly() {
        return getName() + " I am trained by humans to be friendly to other humans and dogs. ";
    }
    public String domesticated() {
        return getName() + " I am domesticated, I live in human houses instead of the wild. ";
    }
    public String interact() {
        return getName() + " I know how to interact with humans in a kind, playful, and loving manner. ";
    }

}
