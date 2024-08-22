public class Eagle extends Bird {
    int b;

    public Eagle(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public int flySpeed() {
        return (a + b);
    };

    @Override
    public String fly() {
        return "Высота полета орлов составляет до 7-9 километров. На такую высоту может подняться не каждый самолёт.";
    };


    public String sound() {
        return "Согласно словарю, клёкот - это прерывистый крик, издаваемый орлом или другой хищной птицей.";
    }
}
