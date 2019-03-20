package ar.com.tvillanueva.euler.controllers;

import ar.com.tvillanueva.euler.forms.EulerForm;
import ar.com.tvillanueva.euler.helpers.MathHelper;
import ar.com.tvillanueva.euler.helpers.PlotHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EulerController {

    @PostMapping("/euler")
    public ResponseEntity getEulerPlot(@RequestBody EulerForm eulerForm){
        double intervalos = eulerForm.getIntervalos();
        double distancia = (eulerForm.getFin() - eulerForm.getInicio()) / intervalos;

        Map<Double, Double> resultadosEulerSimple = MathHelper.eulerSimple(eulerForm.getFuncion(),
                eulerForm.getX0(), eulerForm.getFx0(), intervalos, distancia);

        PlotHelper.graficarYMostrar(resultadosEulerSimple, "Método de Euler");

        return ResponseEntity.status(HttpStatus.OK).body(resultadosEulerSimple);
    }

    @PostMapping("/eulerMejorado")
    public ResponseEntity getEulerMejoradoPlot(@RequestBody EulerForm eulerForm){
        double intervalos = eulerForm.getIntervalos();
        double distancia = (eulerForm.getFin() - eulerForm.getInicio()) / intervalos;

        Map<Double, Double> resultadosEulerMejorado = MathHelper.eulerMejorado(eulerForm.getFuncion(),
                eulerForm.getX0(), eulerForm.getFx0(), eulerForm.getIntervalos(), distancia);

        PlotHelper.graficarYMostrar(resultadosEulerMejorado, "Método de Euler Mejorado");

        return ResponseEntity.status(HttpStatus.OK).body(resultadosEulerMejorado);
    }

}
