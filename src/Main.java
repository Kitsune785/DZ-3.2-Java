public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bodyMassIndex = service.calculate(1.65, 60);

        System.out.println("Индекс массы тела составляет: " + bodyMassIndex);

    }
}
