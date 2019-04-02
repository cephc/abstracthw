package homeworktwo;

public class Lion extends Feline {

    private String kings;
    //constructors
    public Lion(){
    }
    public Lion(String name, int legs, boolean tail, boolean fur, boolean carnivore, boolean spots, String kings){
        super(name, legs, tail, fur, carnivore, spots);
        this.kings = kings;
    }
    //methods
    public String pur(){
        return getName() + " We pur when we are content. ";
    }
    public String howl(){
        return getName() + " We howl when we are in conflict. ";
    }
    public String eat(){
        return getName() + " We eat antelopes, buffaloes, zebras, young elephants, amd more! ";
    }
    public String run(){
        return getName() + " We can run up to 50 mph! ";
    }
    public String sleep(){
        return getName() + " Our males sleep 18 - 20 hours a day, but our females sleep 15 to 18 hours a day. ";
    }
}
