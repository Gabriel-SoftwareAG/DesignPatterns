package ai.verisoft.creational;

public class PrototypeExample {

    // Prototype class implementing Cloneable
    static abstract class Shape implements Cloneable {
        private String type;
        private int edges;

        // Constructors
        public Shape() {
        }

        public Shape(Shape target) {
            if (target != null) {
                this.type = target.type;
                this.edges = target.edges;
            }
        }

        // Getters and setters
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getEdges() {
            return edges;
        }

        public void setEdges(int edges) {
            this.edges = edges;
        }

        @Override
        public abstract Shape clone();

        @Override
        public String toString() {
            return "Shape{" +
                    "type='" + type + '\'' +
                    ", edges=" + edges +
                    '}';
        }
    }

    // Concrete Prototype
    static class Square extends Shape {
        public Square() {
            this.setType("Square");
            this.setEdges(4);
        }

        public Square(Square target) {
            super(target);
        }

        @Override
        public Shape clone() {
            return new Square(this);
        }
    }

    // Main method to demonstrate prototype usage
    public static void main(String[] args) {
        Square originalSquare = new Square();
        Square clonedSquare = (Square) originalSquare.clone();

        System.out.println("Original Square: " + originalSquare);
        System.out.println("Cloned Square: " + clonedSquare);
    }
}

