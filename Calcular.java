public class Calcular {
    public double n1;
    public double n2;
    public char operador;

    public String Calculadora() {
        if(operador == '+') {
            return "" + (n1 + n2);
        }else if(operador == '-') {
            return "" + (n1 - n2);
        }else if(operador == '*') {
            return "" + (n1 * n2);
        }else if(operador == '/') {
            if(n2 == 0) {
                return "A divisão não pode ser feita por zero!";
            }else {
                return "" + (n1 / n2);
            }
        }else {
            return "O operador é invalido, insira um operador valido";
        }
    }

    @Override
    public String toString() {
        return "Resultado: " + Calculadora();
    }
}

