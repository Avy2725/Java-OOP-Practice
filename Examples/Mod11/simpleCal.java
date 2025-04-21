import java.awt.*;

public class simpleCal {
  private Frame f;
  private Label l1, l2, l3;
  private TextField tf1, tf2, tr;
  private Button bAdd, bSub, bMul, bDiv, bClear;


  public simpleCal() {
    f = new Frame("Simple Calculator");

    l1 = new Label("First: ");
    l2 = new Label("Second: ");
    l3 = new Label("Result: ");

    tf1 = new TextField("0.0",10);
    tf2 = new TextField("0.0",10);
    tr = new TextField("0.0", 10);



    bAdd = new Button("+");
    bSub = new Button("-");
    bMul = new Button("x");
    bDiv = new Button("/");
    bClear = new Button("C");

    Dimension btnSize = new Dimension(50, 30);
    bAdd.setPreferredSize(btnSize);
    bSub.setPreferredSize(btnSize);
    bMul.setPreferredSize(btnSize);
    bDiv.setPreferredSize(btnSize);
    bClear.setPreferredSize(btnSize);


    f.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        System.exit(0);
      }
    });
  }

  public void startApp() {
    f.setSize(400, 400);
    f.setLayout(new GridLayout(4, 1));
    f.setBackground(Color.lightGray);
    
    Panel Panel1 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel1.add(l1);
    Panel1.add(tf1);

    Panel Panel2 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel2.add(l2);
    Panel2.add(tf2);

    Panel Panel3 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel3.add(l3);
    Panel3.add(tr);

    Panel Panel4 = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    Panel4.add(bAdd);
    Panel4.add(bSub);
    Panel4.add(bMul);
    Panel4.add(bDiv);
    Panel4.add(bClear);


    f.add(Panel1);
    f.add(Panel2);
    f.add(Panel3);
    f.add(Panel4);

    f.setVisible(true);
  }

  public static void main(String[] args) {
    simpleCal gui = new simpleCal();
    gui.startApp();
  }
}
