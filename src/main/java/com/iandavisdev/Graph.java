package com.iandavisdev;

import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
class Graph {
    List<Coordinate> coordinates;

    private int getGraphWidth() {
        return getMaxCoordinate(Coordinate::x);
    }

    private int getMaxCoordinate(Function<Coordinate, Integer> coordinateIntegerFunction) {
        return coordinates.stream().map(coordinateIntegerFunction)
                .sorted()
                .toList()
                .stream().max(Integer::compareTo).orElseThrow();
    }

    public void draw() {
        drawHorizontalBorder();

        coordinates.stream().sorted(Collections.reverseOrder())
                .forEach(coordinate -> {
                    drawEmptyRow();
                    createRow(coordinate).draw();
                });

        drawHorizontalBorder();
    }

    private Row createRow(Coordinate coordinate) {
        var pixels = Symbol.arrayOfWhitespace(getGraphWidth());
        pixels[coordinate.x() - 1] = Symbol.POINT;
        return new Row(pixels);
    }

    private void drawHorizontalBorder() {
        new Row(Symbol.HORIZONTAL_BORDER.arrayOf(getGraphWidth())).draw();
    }

    private void drawEmptyRow() {
        new Row(Symbol.EMPTY.arrayOf(getGraphWidth())).draw();
    }
}
