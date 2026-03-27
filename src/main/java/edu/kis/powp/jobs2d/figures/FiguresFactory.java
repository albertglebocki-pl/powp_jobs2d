package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;

public class FiguresFactory {
    public static ComplexCommand createFigureSquare(Job2dDriver driver, int sideLength) {
        return new FigureSquare(driver, sideLength);
    }

    public static ComplexCommand createFigureTriangle(Job2dDriver driver, int sideLength) {
        return new FigureTriangle(driver, sideLength);
    }

    public static ComplexCommand createFigureSemiCircle(Job2dDriver driver, int diameter) {
        return new FigureSemiCircle(driver, diameter);
    }
}
