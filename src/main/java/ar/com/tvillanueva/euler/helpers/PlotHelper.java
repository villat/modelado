package ar.com.tvillanueva.euler.helpers;

import org.jfree.ui.RefineryUtilities;

import javax.swing.*;
import java.util.Map;

public class PlotHelper {

    public static void graficarYMostrar(Map<Double, Double> resultadosEulerMejorado, String s) {
        final XYPlotter eulerPlot = new XYPlotter(s, resultadosEulerMejorado);
        eulerPlot.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        eulerPlot.pack();
        RefineryUtilities.centerFrameOnScreen(eulerPlot);
        eulerPlot.setVisible(true);
    }

}
