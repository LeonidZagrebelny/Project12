public class BmiService {
    public int calculate(float height, float weight) {
        float massIndex = (weight / (height * height));
        int result = (int) massIndex;
        return result;

    }
}

