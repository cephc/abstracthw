package homeworktwo;

public abstract class Feline extends Animal{

    private boolean carnivore;
    private boolean spots;
    //constructor
    public Feline(){
    }
    public Feline(String name, int legs, boolean tail, boolean fur, boolean carnivore, boolean spots){
        super(name, legs, tail, fur);
        this.carnivore = carnivore;
        this.spots = spots;
    }
    //methods
    public String pur(){
        return "We pur when we are content. ";
    }
    public String howl(){
        return "We howl when we are in conflict. ";
    }
    public String eat(){
        return "We eat small animals and birds and large herbivores. ";
    }
    public String run(){
        return "We can run between 30 and 75 mph! ";
    }
    public String sleep(){
        return "We enjoy sleeping...a lot! ";
    }
}
