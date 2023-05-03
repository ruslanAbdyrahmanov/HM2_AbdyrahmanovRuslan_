import java.util.Random;

public class Main {
    public static String method(int age, int temp) {                   // Возвращаемый метод
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30)
            return "Can go for a walk";
        else if (age < 20 && temp >= 0 && temp <= 28)
            return "Can go for a walk";
        else if (age > 45 && temp >= -10 && temp <= 25)
            return "Can go for a walk";
        else return "Stay home";

    }

    public static void main(String[] args) {                           //Метод с пятью различными входными даннами
        System.out.println(method(generateRandomAge(), 25));
        System.out.println(method(generateRandomAge(), 14));
        System.out.println(method(generateRandomAge(), 28));
        System.out.println(method(generateRandomAge(), 22));
        System.out.println(method(generateRandomAge(), 30));
    }


    public static int generateRandomAge() {                            // Hm на сообразительность
        Random random = new Random();
        return random.nextInt(90);
    }
}