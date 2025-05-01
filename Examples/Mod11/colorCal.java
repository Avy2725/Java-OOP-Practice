import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorCal {
  private Frame f;
  private Label l1, l2, l3, l4;
  private TextField red, green, blue, alpha;
  private Button com, clear;
  private Panel Panel1, Panel2, Panel3, Panel4, Panel5, Panel6;


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

    com.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        calculate();
      }
    });

    clear.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        clearFields();
      }
    });
    
  }
  private void calculate() {
    try {
      int r = Integer.parseInt(red.getText().trim());
      int g = Integer.parseInt(green.getText().trim());
      int b = Integer.parseInt(blue.getText().trim());
      int a = Integer.parseInt(alpha.getText().trim());

      if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || a < 0 || a > 255) {
        throw new NumberFormatException("Values must be between 0 and 255.");
      } else {
        Color color = new Color(r, g, b,a);
        Panel6.setBackground(color);
      }
    } catch (NumberFormatException ex) {
      System.out.println("Invalid input: " + ex.getMessage());
    }
  }

  private void clearFields() {
    red.setText("0");
    green.setText("0");
    blue.setText("0");
    alpha.setText("0");
    Panel6.setBackground(Color.lightGray);
  }


  public void startApp() {
    f.setSize(400, 400);
    f.setLayout(new GridLayout(6, 1));
    f.setBackground(Color.lightGray);
    
    Panel1 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel1.add(l1);
    Panel1.add(red);

    Panel2 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel2.add(l2);
    Panel2.add(green);

    Panel3 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel3.add(l3);
    Panel3.add(blue);

    Panel4 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel4.add(l4);
    Panel4.add(alpha);

    Panel5 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel5.add(com);
    Panel5.add(clear);

    Panel6 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));

    f.add(Panel1);
    f.add(Panel2);
    f.add(Panel3);
    f.add(Panel4);
    f.add(Panel5);
    f.add(Panel6);

    f.setVisible(true);
  }


  public static void main(String[] args) {
    colorCal gui = new colorCal();
    gui.startApp();
  }
}
