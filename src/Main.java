public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a,int b){
        return a+b;
        }
    }

    }
    // 2. add
    public static int add(int a,int b,int c,int d){
        return add(a,b)+add(c,d);
        }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好， "+name+"!";
        }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
    return "下午好" + name + "!";
    // 5. triple
public static String triple(String "oohbaby"){
        return "oohbaby" + "oohbaby" + "oohbaby";
        }
    // 6. half
public static double half(int n){
        return (int) n/2;
        }
    // 7. roundPositiveValueToNearestInteger
public static double roundNegativeValueToNearestInteger(double pValue){
        return (int) (pValue + 0.5);
        }
    // 8. roundNegativeValueToNearestInteger
public static double roundNegativeValueToNearestInteger(double nValue){
        return (int) (nValue - 0.5);
        }
}
