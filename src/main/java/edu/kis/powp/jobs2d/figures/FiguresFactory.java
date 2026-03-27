package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FiguresFactory {
    public static ComplexCommand createFigureSquare(Job2dDriver driver, int sideLength) {
        return new FigureSquare(driver, sideLength);
    }

    public static ComplexCommand createFigureTriangle(Job2dDriver driver, int sideLength) {
        return new FigureTriangle(driver, sideLength);
    }
}
