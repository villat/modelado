package ar.com.tvillanueva.euler.helpers;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

public class MathHelper {

    public static double evaluarFuncion(double x, double y, String funcion){
        Expression e = new ExpressionBuilder(funcion)
                .variables("x", "y")
                .build()
                .setVariable("x", x)
                .setVariable("y", y);
        return e.evaluate();
    }

    public static Map<Double, Double> eulerSimple(String funcion, double xn, double fxn, double intervalos, double distancia) {
        Map<Double, Double> resultado = new LinkedHashMap<>();
        for (int i=0; i<=intervalos; i++){
            resultado.put(xn, fxn);
            fxn = fxn + evaluarFuncion(xn, fxn, funcion) * distancia;
            xn = xn + distancia;
        }
        return resultado;
    }

    public static Map<Double, Double> eulerMejorado(String funcion, double xn, double fxn, double intervalos, double distancia) {
        Map<Double, Double> resultado = new LinkedHashMap<>();
        double predictor;
        for (int i=0; i<=intervalos; i++){
            resultado.put(xn, fxn);
            predictor = fxn + evaluarFuncion(xn, fxn, funcion) * distancia;
            fxn = fxn + ((evaluarFuncion(xn, fxn, funcion) + evaluarFuncion(xn+distancia, predictor, funcion)) / 2) * distancia;
            xn = xn + distancia;
        }
        return resultado;
    }
}
