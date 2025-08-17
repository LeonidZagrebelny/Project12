public class BmiService {
    public float calculate(float height, float weight) {
        float massIndex = (int)(weight / (height * height));
        return massIndex;

    }
}

