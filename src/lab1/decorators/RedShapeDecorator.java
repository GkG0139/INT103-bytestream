package lab1.decorators;

import lab1.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    shape.draw();
    System.out.println("Border Color: Red");
  }
}
