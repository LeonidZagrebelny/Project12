public class Main {
    public static void main(String[] args) {
        float height = 1.75f;  // Рост в метрах
        float weight = 85.5f;  // Вес в килограммах
        int result;;
        BmiService massIndex = new BmiService();

        result = massIndex.calculate(height, weight);
        System.out.println("индекс массы тела = " + result);
    }
}