package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FiguresFactory {
    public static ComplexCommand createFigureSquare(Job2dDriver driver, int sideLength) {
        ComplexCommand square = new ComplexCommand();

        square.addCommand(new SetPositionCommand(driver, 0, 0));
        square.addCommand(new OperateToCommand(driver, sideLength, 0));
        square.addCommand(new OperateToCommand(driver, sideLength, sideLength));
        square.addCommand(new OperateToCommand(driver, 0, sideLength));
        square.addCommand(new OperateToCommand(driver, 0, 0));

        return square;
    }

    public static ComplexCommand createFigureTriangle(Job2dDriver driver, int sideLength) {
        ComplexCommand triangle = new ComplexCommand();

        triangle.addCommand(new SetPositionCommand(driver, 0, 0));
        triangle.addCommand(new OperateToCommand(driver, sideLength, 0));
        triangle.addCommand(new OperateToCommand(driver, 0, -sideLength));
        triangle.addCommand(new OperateToCommand(driver, 0, 0));

        return triangle;
    }
}
