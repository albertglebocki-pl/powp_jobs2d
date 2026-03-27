package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FigureBuilder {
    private final Job2dDriver driver;
    private final ComplexCommand figure;

    private boolean isDrawing;

    public FigureBuilder(Job2dDriver driver) {
        this.driver = driver;
        this.figure = new ComplexCommand();
    }

    public FigureBuilder moveTo(int x, int y) {
        if (isDrawing) {
            figure.addCommand(new OperateToCommand(driver, x, y));
        } else {
            figure.addCommand(new SetPositionCommand(driver, x, y));
        }

        return this;
    }

    public FigureBuilder enableDrawing() {
        isDrawing = true;

        return this;
    }

    public FigureBuilder disableDrawing() {
        isDrawing = false;

        return this;
    }

    public ComplexCommand build() {
        return figure;
    }
}
