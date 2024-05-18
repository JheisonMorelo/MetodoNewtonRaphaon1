package clases;

public class MetodoNewtonRaphson {

    public MetodoNewtonRaphson() {
    }

    public double funcion(double x) {
        return Math.pow(x, 2);
    }

    public double derivadaFuncion(double x) {
        return 2 * x;
    }

    public double iteracionSiguiente(double x) {
        return x - funcion(x) / derivadaFuncion(x);
    }

    public void evaluarMetodoNewtonRaphson(int iteraciones, double x) {
        System.out.println("i = 0  || x0 = " + x
                + " || f(x0) = " + String.format("%.10f", funcion(x))
                + " || f'(x0) = " + String.format("%.10f", derivadaFuncion(x))
                + " || |xi - xi-1| = *****");

        for (int i = 1; i <= iteraciones; i++) {
            x = iteracionSiguiente(x);
            System.out.println("i = " + i
                    + " || x" + i + " = " + String.format("%.10f", x)
                    + " || f(x" + i + ") = " + String.format("%.10f", funcion(x))
                    + " || f'(x" + i + ") = " + String.format("%.10f", derivadaFuncion(x))
                    + " || |xi - xi-1| = " + String.format("%.10f", Math.abs(iteracionSiguiente(x) - x)));
        }

    }

}
