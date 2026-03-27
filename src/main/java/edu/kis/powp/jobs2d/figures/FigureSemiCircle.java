package edu.kis.powp.jobs2d.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class FigureSemiCircle extends ComplexCommand {
    public FigureSemiCircle(Job2dDriver driver, int diameter) {
        int steps = 30;

        int radius = diameter / 2;

        double startAngle = Math.PI / 2;
        double endAngle = 3 * Math.PI / 2;

        int startX = (int)(radius * Math.cos(startAngle));
        int startY = (int)(radius * Math.sin(startAngle));

        addCommand(new SetPositionCommand(driver, startX, startY));

        for (int i = 1; i <= steps; i++) {
            double angle = startAngle + i * (endAngle - startAngle) / steps;

            int x = (int)(radius * Math.cos(angle));
            int y = (int)(radius * Math.sin(angle));

            addCommand(new OperateToCommand(driver, x, y));
        }
    }
}
