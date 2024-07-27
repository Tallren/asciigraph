package com.iandavisdev;

record Coordinate(int x, int y) implements Comparable<Coordinate>{
    @Override
    public int compareTo(Coordinate o) {
        return Integer.compare(this.y, o.y);
    }
}
