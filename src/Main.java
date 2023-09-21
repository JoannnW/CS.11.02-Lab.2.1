public class Main {

    public static void main(String[] args) {
        int result = add(3,8);
        System.out.println(result);

        int result2 = add(3,8,4,9);
        System.out.println(result2);

        String result3 = morningGreeting("Toby Fox");
        System.out.println(result3);

        String result4 = afternoonGreeting("Max Miller");
        System.out.println(result4);

        String result5 = triple("oohbaby");
        System.out.println(result5);

        double result6 = half(17);
        System.out.println(result6);

        int result7 = roundPositiveValueToNearestInteger(8.5);
        System.out.println(result7);

        int result8 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(result8);
    }

    // 1. add
    public static int add(int a,int b) {
        return a+b;
    }
    // 2. add
    public static int add(int a,int b,int c,int d) {
        return add(add(a,b),add(c,d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String mornining) {
        return "早上好, "+mornining+"!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String afternoon) {
        return "下午好, "+afternoon+"!";
    }
    // 5. triple
    public static String triple(String three) {
        return three+three+three;
    }
    // 6. half
    public static double half(int a) {
        return a/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        return (int) Math.round(a);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double b) {
        return (int) Math.round(b);
    }
}