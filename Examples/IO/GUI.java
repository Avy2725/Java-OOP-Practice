import javax.swing.JOptionPane;
public class GUI {
  
  public static void main(String[] args) {
    // File node - reading and writing to files
    try {
      String input = JOptionPane.showInputDialog("Whats your Name?");
      if (input.equals("")) {
        JOptionPane.showMessageDialog(null, "BAT WALA KA LINAGAY 😡");
        System.exit(0);
      }
      JOptionPane.showMessageDialog(null, input + "You're soooooooooooo Sexy");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
