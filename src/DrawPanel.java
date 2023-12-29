import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;

    private Lada lada;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.lada = new Lada(ticksFromStart, 200, 200, 260, Color.RED);
    }

    Image img = Toolkit.getDefaultToolkit().getImage("Resources/bg1.jpg");

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        gr.drawImage(img, 0, 0, null);
        lada.setX(ticksFromStart);
        lada.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}