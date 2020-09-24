package tutorial2.zuul;

public enum Direction {

        NORTH("north"), SOUTH("south"), EAST("east"), WEST("west"), UP("up"), DOWN("down");

        public String direction;

        Direction(String s) {
            this.direction = s;
        }

        @Override
        public String toString() {
            return this.direction;
        }
}
