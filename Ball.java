public class Ball {
    private String color;
    private float radius;

    public Ball(String c, float r) {
        this.color = c;
        this.radius = r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public String toString() {
        return "Color " + this.color + ", radius - " + this.radius;
    }

    public void toMetres() {
        radius /= 100f;
        System.out.println("Radius in metres - " + radius);
    }
}
