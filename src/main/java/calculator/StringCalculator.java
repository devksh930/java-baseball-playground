package calculator;

public class StringCalculator {
    private final static String[] operators = {"+", "-", "*", "/"};


    public int Calc(String input) {
        String[] values = input.split(" ");
        int result = Integer.parseInt(values[0]);
        String operator = null;
        for (int i = 1; i < values.length; i++) {

            if (isOperator(values[i])) {
                operator = values[i];
            } else {
                result = findOperator(operator, result, values[i]);
            }
        }
        return result;
    }

    private int findOperator(String operator, int result, String value) {
        switch (operator) {
            case "+":
                return add(result, Integer.parseInt(value));
            case "-":
                return subtract(result, Integer.parseInt(value));
            case "*":
                return multiply(result, Integer.parseInt(value));
            case "/":
                return divide(result, Integer.parseInt(value));
        }
        return 0;
    }

    public Boolean isOperator(String input) {
        for (String s : operators) {
            if (s.equals(input)) {
                return true;
            }
        }
            return false;
    }


    public int add(int result, int num) {
        return result + num;
    }

    public int subtract(int result, int num) {
        return result - num;
    }

    public int multiply(int result, int num) {
        return result * num;
    }

    public int divide(int result, int num) {

        return result / num;
    }
}
