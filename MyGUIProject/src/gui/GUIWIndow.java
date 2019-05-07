package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GUIWIndow {

	protected Shell shell;
	private Text vornameTF;
	private Text nachnameTF;
	private Label vornameOut;
	private Label nachnameOut;
	private Button btnNewButton;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUIWIndow window = new GUIWIndow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblVorname = new Label(shell, SWT.NONE);
		lblVorname.setBounds(10, 29, 55, 15);
		lblVorname.setText("Vorname");
		
		Label lblNachname = new Label(shell, SWT.NONE);
		lblNachname.setBounds(10, 72, 68, 15);
		lblNachname.setText("Nachname");
		
		vornameTF = new Text(shell, SWT.BORDER);
		vornameTF.setBounds(89, 23, 76, 21);
		
		nachnameTF = new Text(shell, SWT.BORDER);
		nachnameTF.setBounds(89, 69, 76, 21);
		
		vornameOut = new Label(shell, SWT.NONE);
		vornameOut.setBounds(189, 29, 55, 15);
		
		nachnameOut = new Label(shell, SWT.NONE);
		nachnameOut.setBounds(189, 72, 55, 15);
		
		Button btnButton = new Button(shell, SWT.NONE);
		btnButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getVornameOut().setText(getVornameTF().getText());
				getNachnameOut().setText(getNachnameTF().getText());
			}
		});
		btnButton.setBounds(349, 226, 75, 25);
		btnButton.setText("Speichern");
		
		btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(268, 226, 75, 25);
		btnNewButton.setText("New Button");

	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Label getVornameOut() {
		return vornameOut;
	}
	public Label getNachnameOut() {
		return nachnameOut;
	}
}
