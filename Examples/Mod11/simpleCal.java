import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

    tf1 = new TextField("0.0", 10);
    tf2 = new TextField("0.0", 10);
    tr = new TextField("0.0", 10);
    tr.setEditable(false);

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

    bAdd.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        calculate('+');
      }
    });

    bSub.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        calculate('-');
      }
    });

    bMul.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        calculate('*');
      }
    });

    bDiv.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        calculate('/');
      }
    });

    bClear.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        clearFields();
      }
    });

    f.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        System.exit(0);
      }
    });
  }

  private void calculate(char operator) {
    try {
      double num1 = Double.parseDouble(tf1.getText());
      double num2 = Double.parseDouble(tf2.getText());
      double result = 0;

      switch (operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          if (num2 != 0) {
            result = num1 / num2;
          } else {
            tr.setText("Error");
            return;
          }
          break;
      }
      tr.setText(String.valueOf(result));
    } catch (NumberFormatException ex) {
      tr.setText("Error");
    }
  }

  private void clearFields() {
    tf1.setText("0.0");
    tf2.setText("0.0");
    tr.setText("0.0");
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

