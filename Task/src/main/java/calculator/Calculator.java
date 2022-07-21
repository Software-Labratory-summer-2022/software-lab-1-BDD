package calculator;

public class Calculator {
    public int calculate(int a, int b, String operation) {
        if (operation.equals("*")) return a * b;
        if (operation.equals("/")) return a / b;
        if (operation.equals("^")) {
            if (b == 0) return 1;
            int answer = 1;
            for (int i = 0; i < b; i++) {
                answer *= a;
            }
            return answer;
        }
        return 0;
    }
}
