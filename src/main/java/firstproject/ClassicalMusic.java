package firstproject;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {};

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doInit() {
        System.out.println("init classical music");
    }
    public void doDestruction() {
        System.out.println("end of classical music");
    }

    @Override
    public String getSong() {
        return "Adidas";
    }
}
