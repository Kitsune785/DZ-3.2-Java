public class BmiService {

    public double calculate(double growth, double weight) {

        double bodyMassIndex = weight / (growth * growth);

        return bodyMassIndex;
    }
}
