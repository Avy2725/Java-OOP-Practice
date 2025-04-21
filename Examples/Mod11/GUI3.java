import java.awt.*;

public class GUI3 {
  private Frame f;
  private Button bAdd, bSub, bMul, bDiv;

  public GUI3() {
    f = new Frame("My GUI3");
    bAdd = new Button("+");
    bSub = new Button("-");
    bMul = new Button("x");
    bDiv = new Button("/");

    f.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        System.exit(0);
      }
    });
  }

  public void startApp() {
    f.setSize(400, 400);
    f.setBackground(Color.LIGHT_GRAY);


    f.setLayout(new FlowLayout());

    f.add(bAdd);
    f.add(bSub);
    f.add(bMul);
    f.add(bDiv);

    f.setVisible(true);
  }

  

  public static void main(String[] args) {
    GUI3 gui = new GUI3();
    gui.startApp();
  }
}
