package lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Complex {
    private int x;
    private int y;

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Complex plusComplex(Complex number1, Complex number2){
        Complex temp = new Complex();
        temp.x = number1.getX() + number2.getX();
        temp.y = number1.getY() + number2.getY();
        return temp;
    }

    Complex minusComplex(Complex number1, Complex number2){
        Complex temp = new Complex();
        temp.x = number1.getX() - number2.getX();
        temp.y = number1.getY() - number2.getY();
        return temp;
    }

    Complex multiplyComplex(Complex number1, Complex number2){
        Complex temp = new Complex();
        temp.x = number1.getX() * number2.getX();
        temp.y = number1.getY() * number2.getY();
        return temp;
    }

    Complex divideComplex(Complex number1, Complex number2){
        Complex temp = new Complex();
        temp.x = number1.getX() / number2.getX();
        temp.y = number1.getY() / number2.getY();
        return temp;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
