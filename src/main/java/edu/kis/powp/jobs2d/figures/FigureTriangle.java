package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FigureTriangle extends ComplexCommand {
    public FigureTriangle(Job2dDriver driver, int sideLength) {
        addCommand(new SetPositionCommand(driver, 0, 0));
        addCommand(new OperateToCommand(driver, sideLength, 0));
        addCommand(new OperateToCommand(driver, 0, -sideLength));
        addCommand(new OperateToCommand(driver, 0, 0));
    }
}
