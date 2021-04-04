public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75.3;
        double height = 1.6;
        double bodyMassIndex = service.calculate(weight,height);
        System.out.println(bodyMassIndex);
    }
}
