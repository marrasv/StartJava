public class Calculator{

    private int a;
    private char sign;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void Calc() {

       switch (sign) {
            case '+':
                System.out.println(a + " " + sign + " " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " " + sign + " " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " " + sign + " " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " " + sign + " " + b + " = " + (a / b));
                break;
            case  '%':
                System.out.println(a + " " + sign + " " + b + " = " + (a % b));
                break;
            case '^':
                multi();
                break;
            default:
                System.out.println("введенная мат. операция не поддерживается");
        }
        
    }

    private void multi(){
        int mult = 1;
        for (int i = 1; i <=b; i++){
            mult *=a;
        }
        System.out.println(a + " " + sign + " " + b + " = " + mult);
    }
}