package spring.core.bean_autowiring;

public class ShapeBox {

	private Circle circle;
	 
    public ShapeBox(){
    }
 
    public ShapeBox(Circle circle){
        System.out.println("ShapeBox autowire "+ circle.getId() +" by constructor");  
    }
    public Circle getCircle() {
        return circle;
    }
 
    public void setCircle(Circle circle) {
        this.circle = circle;
        System.out.println("ShapeBox autowire "+ circle.getId() +" by "+ circle.getAutowire());
    }
}
