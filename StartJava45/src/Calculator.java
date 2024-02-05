public class Calculator {
    /*private static double a;
    private static char sign;
    private static double b;

    /*public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }
*/
    public static void Calc(String mathExpression) {
        double a;
        char sign;
        double b;
        String[] array = mathExpression.split(" ");
        //setA(Double.parseDouble(array[0]));
        //setSign((char)(array[1]).charAt(0));
        //setB(Double.parseDouble(array[2]));
        a = Double.parseDouble(array[0]);
        sign = array[1].charAt(0);
        b = Double.parseDouble(array[2]);
        double result;
        switch (sign) {
            case '+' -> result = a + b;
            case '-'-> result = a - b;
            case '*'-> result = a * b;
            case '/'-> result = a / b;
            case '%'-> result = a % b;
            case '^'-> result = Math.pow(a, b);
            default -> result = Double.MAX_VALUE;
        }//end switch

        if (result != Double.MAX_VALUE) {
            if (result == (int)result ){
                System.out.println((int)(result));
            } else {
                System.out.printf("%.3f\n",result);
            }
            //System.out.printf( (c.Calc() == (int)(c.Calc()) ? "%.3f\n",c.Calc(): ("%.0f\n",c.Calc()));
        } else {
            System.out.println(("Ошибка: знак " + array[1] + " не поддерживается"));
        }
    }//end Calc()
}// end class