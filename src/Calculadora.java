
public class Calculadora {
    double num1;
    double num2;
    
    public Calculadora(double num1) {
        this.num1 = num1;
    }

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }


    public double getNum2() {
        return num2;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }


    public double suma(double num1, double num2) {
        return num1 + num2;
    }
    public double resta(double num1, double num2) {
        return num1 - num2;
    }
    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    public double division(double num1, double num2) {
        return num1 / num2;
    }
    public double valorAbsoluto(double num1) {
        return Math.abs(num1);
    }
    public double elevarUnNumero(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    public boolean esPositivo(double num1) {
        if (num1 > 0) {
            return true;
        } else {
            return false;
        }
        
    }
}
