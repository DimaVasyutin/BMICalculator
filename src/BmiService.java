public class BmiService {
    public float calculate(float mass, float hight) {
        float bmi = mass / (hight * hight);
        return bmi;
    }

}

