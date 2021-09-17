public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.4;
        double weight = 43;
        double bodyMassIndex = service.calculate(weight, height);
        System.out.println("Индекс массы вашего тела: " + bodyMassIndex);
    }
}
