public class BmiService {
    public float calculate(float height, float weight) {
        float massIndex = (weight / (height * height));
        return (int)massIndex;

    }
}

