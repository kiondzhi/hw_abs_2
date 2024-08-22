public class Hawk extends Bird {
    int b;
    int c;

    public Hawk(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public int flySpeed() {
        return (a - b + c);
    };

    @Override
    public String fly() {
        return "Ястреб летает на высоте полтора километра.";
    };


    public String sound() {
        return "Как и другие ястребы, ястребы-тетеревятники общаются между собой посредством звуковых сигналов, издавая высокий звонкий клёкот. ";
    }
}
