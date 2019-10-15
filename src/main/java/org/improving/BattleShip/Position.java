package org.improving.BattleShip;

import java.awt.*;

public class Position {
    private static Point from;
    private static Point to;

    public Position(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

}

