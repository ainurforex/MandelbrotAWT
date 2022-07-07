import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintIt extends JFrame {
    JFrame f = this;
    JPanel jp;

    public PaintIt() {
        f.setTitle("Mandelbrot");
        f.setSize(800, 600);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp = new GPanel();
        f.add(jp);
        f.setVisible(true);
    }

    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

    public static void main(String[] args) {
        PaintIt g1 = new PaintIt();
        g1.setVisible(true);
    }

    class GPanel extends JPanel {
        public GPanel() {
            f.setPreferredSize(new Dimension(f.getWidth(), f.getHeight()));
        }

        @Override
        public void paintComponent(Graphics g) {
            int width = getWidth();
            int height = getHeight();

            double x0 = (width / 2);
            double y0 = (height / 2);
            double scale = Math.min(height,width)/4;

            double lenghtX0 = 1 * scale;
            double lenghtY0 = 1 * scale;
            Complex z;
            Color []colors256=colorArray();
            for (int i = 1; i < width - 1; i++) {
                for (int j = 1; j < height - 1; j++) {
                    double x = (i - x0) / lenghtX0;
                    double y = (j - y0) / lenghtY0;
                    z = new Complex(x, y);

                    int color = getColor(z);
                    if (color != 255) {

                        g.setColor(colors256[color]);
                        g.drawLine(i, j, i, j);
                    }

                }
            }


        }
    }

    private static int getColor(Complex z0) {
        Complex z = z0;

        for (int i = 255; i > 1; i--) {
            if (z.abs() > 2) {
                return i;
            }
            z = z.mul(z).add(z0);
        }

        return 0;
    }

    private static Color[] colorArray() {
        int red[] = {0, 36, 73, 109, 146, 182, 219, 255};
        int green[] = red;
        int blue[] = {0, 85, 170, 255};
        Color colors256[] = new Color[256];
        int m = 0;

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                for (int k = 0; k < 4; k++) {

                    colors256[m++] = new Color(red[i], green[j], blue[k]);
                }
            }
        }
        return colors256;
    }
}