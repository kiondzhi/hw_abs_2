public abstract class Bird {
    int a;

    public Bird(int a) {
        this.a = a;
    }

    public abstract int flySpeed();

    public String fly() {
        return "Птица умеет летать на уровне облаков";
    };

    public String makeSound() {
        return "Издает привычные нам звуки";
    };

}
