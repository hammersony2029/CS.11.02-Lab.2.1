public class Main {
    public static void main(String[] args) {

        int sumTwo = add(5, 7);
        System.out.println(sumTwo);

        int sumFour = add(5, 7, 6, 6);
        System.out.println(sumFour);

        String morning = morningGreeting("Toby Fox");
        System.out.println(morning);

        String afternoon = afternoonGreeting("Mac Miller");
        System.out.println(afternoon);

        String tripled = triple("oohbaby");
        System.out.println(tripled);

        double halfVal = half(19);
        System.out.println(halfVal);

        int roundPos1 = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPos1);

        int roundPos2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundPos2);

        int roundNeg1 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundNeg1);

        int roundNeg2 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNeg2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c, int d) {
        return add(add(add(a, b), c), d);
    }

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    public static String triple(String str) {
        return str + str + str;
    }

    public static double half(int num) {
        return num / 2.0;
    }

    public static int roundPositiveValueToNearestInteger(double num) {
        return (int) (num + 0.5);
    }

    public static int roundNegativeValueToNearestInteger(double num) {
        return (int) (num - 0.5);
    }
}
