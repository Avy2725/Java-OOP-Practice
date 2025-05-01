import java.awt.*;

public class btn1 {

  private Frame f;
  private Button b;

public btn1() {
f = new Frame("Delegation Event Model");
b = new Button("Click me!");
b.addActionListener(new myEvent1());
b.addActionListener(new myEvent2());

f.addWindowListener(new java.awt.event.WindowAdapter() {
  @Override
  public void windowClosing(java.awt.event.WindowEvent windowEvent) {
    System.exit(0);
  }
});
}

public void startApp() {
f.add(b);
f.pack();
f.setVisible(true);
}

public static void main(String args[]){
  btn1 m = new btn1();
  m.startApp();
}
}
