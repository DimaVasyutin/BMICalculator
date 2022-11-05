public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 74F;
        float hight = 1.72F;
        float bmi = service.calculate(mass, hight);
        System.out.println(bmi);
    }
}
