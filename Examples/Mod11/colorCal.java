import java.awt.*;

public class colorCal {
  private Frame f;
  private Label l1, l2, l3, l4;
  private TextField red, green, blue, alpha;
  private Button com, clear;


  public colorCal() {
    f = new Frame("Color Calculator");

    l1 = new Label("Red: ");
    l2 = new Label("Green: ");
    l3 = new Label("Blue: ");
    l4 = new Label("Alpha: ");

    red = new TextField("0",15);
    green = new TextField("0",15);
    blue = new TextField("0", 15);
    alpha = new TextField("0", 15);

    

    

    com = new Button("Compute");
    clear = new Button("Clear");

    Dimension btnSize = new Dimension(120, 30);
    com.setPreferredSize(btnSize);
    clear.setPreferredSize(btnSize);


    f.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        System.exit(0);
      }
    });
  }

  public void startApp() {
    f.setSize(400, 400);
    f.setLayout(new GridLayout(5, 1));
    f.setBackground(Color.lightGray);
    
    Panel Panel1 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel1.add(l1);
    Panel1.add(red);

    Panel Panel2 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel2.add(l2);
    Panel2.add(green);

    Panel Panel3 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel3.add(l3);
    Panel3.add(blue);

    Panel Panel4 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel4.add(l4);
    Panel4.add(alpha);

    Panel Panel5 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel5.add(com);
    Panel5.add(clear);

    f.add(Panel1);
    f.add(Panel2);
    f.add(Panel3);
    f.add(Panel4);
    f.add(Panel5);

    f.setVisible(true);
  }

  public static void main(String[] args) {
    colorCal gui = new colorCal();
    gui.startApp();
  }
}
