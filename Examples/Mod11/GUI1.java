import java.awt.*;

public class GUI1 {
  private Frame f;


  private int x = 700;
  private int y = 500;

  public GUI1() {
    f = new Frame("Sample GUI1");
  }

  public void startApp() {
    f.setBackground(Color.YELLOW);
    f.setSize(x, y);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    GUI1 gui = new GUI1();
    gui.startApp();
  }
}
