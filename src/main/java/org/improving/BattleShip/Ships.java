package org.improving.BattleShip;

import javax.swing.text.Position;

public class Ships {
   public String name;
   public int size;
   public Position position;

    public Ships(String name, int size, Position position) {
        this.name = name;
        this.size = size;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}




