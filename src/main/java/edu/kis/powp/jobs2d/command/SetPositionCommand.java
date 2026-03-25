package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    private final Job2dDriver commandRecipient;
    private final int x;
    private final int y;

    public SetPositionCommand(Job2dDriver commandRecipient, int x, int y) {
        this.commandRecipient = commandRecipient;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        commandRecipient.setPosition(x, y);
    }
}
