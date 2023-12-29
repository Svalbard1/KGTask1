import java.awt.*;

public class Lada {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Lada(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        //Передняя часть
        g.setColor(this.color);
        g.fillRect((int)(this.x + 0.25 * this.width), (int)(this.y + 0.25 * this.height), this.width, (int)(0.4 * this.height));
        g.setColor(Color.BLACK);
        g.drawRect((int)(this.x + 0.25 * this.width), (int)(this.y + 0.25 * this.height), this.width, (int)(0.4 * this.height));

        //Задняя часть
        g.setColor(new Color(255,255,0));
        g.fillRect(this.x, this.y, (int)(this.width * 0.45), (int)(0.65 * this.height));
        g.setColor(Color.BLACK);
        g.drawRect(this.x, this.y, (int)(this.width * 0.45), (int)(0.65 * this.height));

        //Заднее колесо
        g.setColor(new Color(0,77,255));
        g.fillOval(this.x - 5, (int)(this.y * 1.6), (int)(this.width * 0.5), (int)(0.5 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval(this.x - 5, (int)(this.y * 1.6), (int)(this.width * 0.5), (int)(0.5 * this.height));

        //Переднее колесо
        g.setColor(new Color(0,77,255));
        g.fillOval((int)(this.x + 0.8 * this.width), (int)(this.y * 1.6), (int)(this.width * 0.5), (int)(0.5 * this.height));
        g.setColor(Color.BLACK);
        g.drawOval((int)(this.x + 0.8 * this.width), (int)(this.y * 1.6), (int)(this.width * 0.5), (int)(0.5 * this.height));

        //Окно
        g.setColor(new Color(255,255,255));
        g.fillRect(this.x + 15, this.y + 10, (int)(this.width * 0.3), (int)(0.3 * this.height));
        g.setColor(Color.BLACK);
        g.drawRect(this.x + 15, this.y + 10, (int)(this.width * 0.3), (int)(0.3 * this.height));
    }
}