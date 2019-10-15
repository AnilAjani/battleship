package org.improving.BattleShip;

import org.springframework.stereotype.Component;

@Component
public class Board {
    private Location[][] grid;
    private int points;

    public static final int NUM_ROWS = 7;
    public static final int NUM_COL = 7;

    public Board(Location[][] grid, int points) {
        this.grid = grid;
        this.points = points;

        grid = new Location[NUM_ROWS][NUM_COL];

        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[row].length; col++){
                Location location = new Location();
                grid [row][col] = location;
            }
        }
    }




}
