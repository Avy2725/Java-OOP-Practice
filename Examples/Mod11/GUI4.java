import java.awt.*;

public class GUI4 {
  private Frame f;


  public GUI4() {
    f = new Frame("My GUI4");



    f.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        System.exit(0);
      }
    });
  }

  public void startApp() {
    f.setSize(400, 400);
    f.setLayout(new BorderLayout(10,10));
    f.setBackground(Color.LIGHT_GRAY);
    

    Panel topPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    topPanel.setBackground(Color.cyan);
    topPanel.add(new Button("top btn1"));
    topPanel.add(new Button("top btn2"));
    topPanel.add(new Button("top btn3"));

    Panel centerPanel = new Panel(new GridLayout(2, 2, 5, 5));
    centerPanel.setBackground(Color.pink);
    centerPanel.add(new Button("Grid btn1"));
    centerPanel.add(new Button("Grid btn2"));
    centerPanel.add(new Button("Grid btn3"));
    centerPanel.add(new Button("Grid btn4"));

    
    Panel bottomPanel = new Panel(new FlowLayout(FlowLayout.TRAILING, 10, 10));
    bottomPanel.setBackground(Color.green);
    bottomPanel.add(new Button("OK"));
    bottomPanel.add(new Button("CANCEL"));


  

    

    f.setVisible(true);
    f.add(topPanel, BorderLayout.NORTH);
    f.add(centerPanel, BorderLayout.CENTER);
    f.add(bottomPanel, BorderLayout.SOUTH);

  }

  

  public static void main(String[] args) {
    GUI4 gui = new GUI4();
    gui.startApp();
  }
}
