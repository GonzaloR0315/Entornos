package pq1;

public class Triangulo extends Forma2d {
    String style;
    public Triangulo(String style,double w, double a) {
    	this.style=style;
    	w=getWidth();
    	a=getHeight();
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
}

