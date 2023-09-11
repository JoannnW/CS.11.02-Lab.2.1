public class Main {
    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a,int b){
        int result = add(3,8);
        return a+b;
    }

    // 2. add
    public static int add(int a,int b,int c,int d){
        int result = add(5,7,6,6);
        return a+b+c+d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好， "+morningGreeting("Toby Fox")+"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好 " + afternoonGreeting("Mac Miller") + "!";

        // 5. triple
        public static String triple(String name){
            return triple+triple+triple;
        }
        // 6. half
        public static double half(int n){
            return n/2.0;
        }
        // 7. roundPositiveValueToNearestInteger
        public static int roundNegativeValueToNearestInteger(double pValue){
            return (int) (pValue + 0.5);
        }
        // 8. roundNegativeValueToNearestInteger
        public static int roundNegativeValueToNearestInteger(double nValue){
            return (int) (nValue - 0.5);
        }
    }

}
