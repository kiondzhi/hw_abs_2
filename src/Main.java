//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Eagle eagle = new Eagle(6, 8);

    Hawk hawk = new Hawk(4, 5, 6);

    System.out.println(hawk.fly());
    System.out.println(hawk.sound());
    System.out.println(hawk.flySpeed());
    System.out.println("-----------------------------------");
    System.out.println(eagle.fly());
    System.out.println(eagle.sound());
    System.out.println(eagle.flySpeed());
    }

}