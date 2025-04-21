import java.awt.*;

public class GUI2 {
  private Frame f;
  private Panel p;

  private int x = 700;
  private int y = 500;

  public GUI2() {
    f = new Frame("Sample GUI2");
    p = new Panel();
  }

  public void startApp() {
    f.setBackground(Color.YELLOW);
    f.setSize(x, y);

    p.setSize(200, 200);
    p.setBackground(new Color(128, 0, 128));


    f.setLayout(null);
    f.add(p);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    GUI2 gui = new GUI2();
    gui.startApp();
  }
}
