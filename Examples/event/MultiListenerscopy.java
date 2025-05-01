import java.awt.*;
import java.awt.event.*;

public class MultiListenerscopy implements MouseListener, MouseMotionListener 
{
	private Frame f;
	private TextField tf;
	private Label label;

	// Required methods for MouseListener and MouseMotionListener


	public MultiListenerscopy () 
	{
    f = new Frame("I have Two listeners example");
    tf = new TextField(30);
    label = new Label("Click and drag the mouse");
	}

  	public void startApp() {
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
		f.setSize(300, 200);
		f.setVisible(true);
		// event handler registration
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.addWindowListener(new Close());
 	}

	  	// The event handlers
	@Override		
	public void mouseMoved(MouseEvent e) {
			tf.setText("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
			tf.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
	}
	@Override
	public void mousePressed(MouseEvent e) {
			tf.setText("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
			tf.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		tf.setText("Mouse entered the frame");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		tf.setText("Mouse exited the frame");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		tf.setText("Mouse dragged to (" + e.getX() + ", " + e.getY() + ")");
	}

	private class Close extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

	public static void main(String args[]) {
    		MultiListenerscopy  ml = new MultiListenerscopy ();
    		ml.startApp();
  	}
}   

