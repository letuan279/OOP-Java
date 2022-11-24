public class EquationSolve {
    public static void main(String[] args) {
        // first degree equation one variable
        String answer1 = firstDegreeEquationLinear(1, 2);

        // first degree equation two variable
        String answer2 = firstDegreeEquationLinear(1, 2, 3, 4, 5, 6);

        // second degree equation one variable
        String answer3 = secondDegreeEquation(1, 2, 1);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }

    private static String firstDegreeEquationLinear(double a, double b) {
        if (a == 0)
            return "a have to not equal 0";

        return "Solution: " + ((-1) * b / a);
    }

    private static String firstDegreeEquationLinear(double a11, double a12, double b1, double a21, double a22,
            double b2) {
        Double D = a11 * a22 - a12 * a21;
        Double D1 = b1 * a22 - b2 * a12;
        Double D2 = a11 * b2 - a21 * b1;
        return "Solution: " + " x1 = " + (D1 / D) + " x2 = " + (D2 / D);
    }

    private static String secondDegreeEquation(double a, double b, double c) {
        if (a == 0)
            return "a have to not equal 0";
        double delta = b * b - 4 * a * c;
        double x1 = (b + delta) / (2 * a);
        double x2 = (b - delta) / (2 * a);
        return "Solution: " + " x1 = " + x1 + " x2 = " + x2;
    }
}
