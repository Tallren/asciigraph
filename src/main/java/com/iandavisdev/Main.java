package com.iandavisdev;

import java.util.List;

public class Main {

    private static final List<Coordinate> COORDINATES = List.of(
            new Coordinate(1, 2),
            new Coordinate(2, 3),
            new Coordinate(3, 1),
            new Coordinate(4, 6),
            new Coordinate(5, 8),
            new Coordinate(10, 10)
    );
    private static final Graph GRAPH = new Graph(COORDINATES);

    public static void main(String[] args) {
        GRAPH.draw();
    }
}