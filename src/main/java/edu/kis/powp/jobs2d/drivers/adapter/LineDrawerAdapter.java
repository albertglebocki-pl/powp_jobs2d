package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import javax.sound.sampled.Line;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver {
    public enum LineType {
        BASIC, SPECIAL, DOTTED
    }

    private LineType lineType;
    private int startX = 0, startY = 0;

    public LineDrawerAdapter(LineType lineType) {
        super();
        this.lineType = lineType;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = null;

        switch (lineType) {
            case BASIC:
                line = LineFactory.getBasicLine();
                break;
            case SPECIAL:
                line = LineFactory.getSpecialLine();
                break;
            case DOTTED:
                line = LineFactory.getDottedLine();
                break;
        }

        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        DrawerFeature.getDrawerController().drawLine(line);

        this.startX = x;
        this.startY = y;
    }

    @Override
    public String toString() {
        switch (lineType) {
            case BASIC:
                return "Basic Line Drawer driver";
            case SPECIAL:
                return "Special Line Drawer driver";
            case DOTTED:
                return "Dotted Line Drawer driver";
        }

        return "Cutom Line Drawer driver";
    }
}
