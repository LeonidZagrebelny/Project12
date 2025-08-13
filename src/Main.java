public class Main {
    public static void main(String[] args) {
        float height = 1.75f;  // Рост в метрах
        float weight = 85.5f;  // Вес в килограммах

        BmiService Ind = new BmiService();

        float Result = Ind.calculate(height, weight);
        System.out.println("индекс массы тела = " + (int) Result);
    }
}