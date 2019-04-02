package homeworktwo;

public abstract class Animal {

    private String name;
    private int legs;
    private boolean fur;
    private boolean tail;
    //constructor
    public Animal() {
    }
    public Animal(String name, int legs, boolean tail, boolean fur) {
        this.name = name;
        this.legs = legs;
        this.tail = tail;
        this.fur = fur;
    }
    //methods
    public abstract String eat();
    public abstract String run();
    public abstract String sleep();
    //getters
    public String getName(){
        return this.name;
    }
    public int getLegs() {
        return this.legs;
    }
    public boolean isFur() {
        return this.fur;
    }
    public boolean isTail() {
        return this.tail;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public void setFur(boolean fur) {
        this.fur = fur;
    }
    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
