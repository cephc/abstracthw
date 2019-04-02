package homeworktwo;

public class Main {
    public static void main(String[] args) {

        Agent spy = new Agent("Spy", true, true);
        System.out.println(spy.manual());
        System.out.println(spy.job());

        Cat munchkin = new Cat("Munchkin Cat", 4, true, true, true, false);
        System.out.println(munchkin.domesticated());
        System.out.println(munchkin.eat());
        System.out.println(munchkin.friendly());
        System.out.println(munchkin.howl());
        System.out.println(munchkin.interact());
        System.out.println(munchkin.pur());
        System.out.println(munchkin.run());
        System.out.println(munchkin.sleep());

        Dog yorkie = new Dog("Yorkie", 4, true, true, 4, true);
        System.out.println(yorkie.domesticated());
        System.out.println(yorkie.eat());
        System.out.println(yorkie.friendly());
        System.out.println(yorkie.interact());
        System.out.println(yorkie.run());
        System.out.println(yorkie.sleep());
        System.out.println(yorkie.smell());
        System.out.println(yorkie.taste());

        Hippo hip = new Hippo("Hippo", 4, true, false, true);
        System.out.println(hip.eat());
        System.out.println(hip.run());
        System.out.println(hip.sleep());

        Lion lili = new Lion("Lion", 4, true, true, true, false, "We are the king of the jungle! ");
        System.out.println(lili.eat());
        System.out.println(lili.howl());
        System.out.println(lili.pur());
        System.out.println(lili.run());
        System.out.println(lili.sleep());

        Robodog robo = new Robodog("Robo Dog", true, true, "We say BARK! ");
        System.out.println(robo.domesticated());
        System.out.println(robo.friendly());
        System.out.println(robo.interact());
        System.out.println(robo.job());
        System.out.println(robo.manual());

        Tiger tig = new Tiger("Tiger", 4, true, true, true, false, true);
        System.out.println(tig.eat());
        System.out.println(tig.howl());
        System.out.println(tig.pur());
        System.out.println(tig.run());
        System.out.println(tig.sleep());

        Wolf mexican = new Wolf("Mexican Wolf", 4, true, true, 4, true);
        System.out.println(mexican.eat());
        System.out.println(mexican.howler());
        System.out.println(mexican.run());
        System.out.println(mexican.sleep());
        System.out.println(mexican.smell());
        System.out.println(mexican.taste());




    }
}
