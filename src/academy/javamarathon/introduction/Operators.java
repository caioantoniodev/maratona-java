package academy.javamarathon.introduction;

public class Operators {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 10;

        System.out.println(calculator("soma", number1, number2));
        System.out.println(calculator("subtração", number1, number2));
        System.out.println(calculator("multiplicação", number1, number2));
        System.out.println(calculator("divisão", number1, number2));

        boolean tenIsGreaterThanTwenty = 10 > 20;

        System.out.println(tenIsGreaterThanTwenty);

        boolean tenIsLessThanTwenty = 10 < 20;

        System.out.println(tenIsLessThanTwenty);

        boolean tenIsEqualToTwenty = 10 == 20;
        System.out.println(tenIsLessThanTwenty);

        boolean tenIsDifferentThanTwenty = 10 != 20;
        System.out.println(tenIsDifferentThanTwenty);
    }

    public static String calculator(String operation, int n1, int n2) {
        String result;

        switch (operation) {
            case "soma":
                result = operation + " -> " + ( n1 + n2);
                break;
            case "subtração":
                result = operation + " -> " + ( n1 - n2);
                break;
            case "multiplicação":
                result = operation + " -> " + ( n1 * n2);
                break;
            case "divisão":
                result = operation + " -> " + ( n1 / n2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        
        return result;
    }
}
