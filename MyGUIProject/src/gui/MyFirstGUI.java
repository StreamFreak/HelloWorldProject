package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyFirstGUI extends MyFirstGUIWindow {
	private static Text VornameTF;
	private static Text NachnameTF;
	private static Text straﬂeTF;
	private static Text hausnummerTF;
	private static Text postleitzahlTF;
	private static Text ortTF;
	private static Label VornameTFout;
	private static Label NachnameTFout;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlLhwindow = new Shell();
		shlLhwindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND));
		shlLhwindow.setCapture(true);
		shlLhwindow.setCursor(SWTResourceManager.getCursor(SWT.CURSOR_HAND));
		shlLhwindow.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		shlLhwindow.setSize(450, 300);
		shlLhwindow.setText("LHWindow");
		
		Button btnNewButton = new Button(shlLhwindow, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Ihre Daten:");
				System.out.println(VornameTF.getText());
				System.out.println(NachnameTF.getText());
				System.out.println(hausnummerTF.getText());
				System.out.println(postleitzahlTF.getText());
				System.out.println(ortTF.getText());
				System.out.println(straﬂeTF.getText());
				//
				
				
				
				
			}
		});
		btnNewButton.setBounds(10, 10, 75, 25);
		btnNewButton.setText("Speichern");
		
		Label lblNewLabel = new Label(shlLhwindow, SWT.NONE);
		lblNewLabel.setBounds(10, 41, 55, 15);
		lblNewLabel.setText("Vorname");
		
		Label lblNachname = new Label(shlLhwindow, SWT.NONE);
		lblNachname.setText("Nachname");
		lblNachname.setBounds(10, 78, 63, 15);
		
		Label lblStrae = new Label(shlLhwindow, SWT.NONE);
		lblStrae.setText("Stra\u00DFe");
		lblStrae.setBounds(10, 117, 55, 15);
		
		Label lblHausnummer = new Label(shlLhwindow, SWT.NONE);
		lblHausnummer.setText("Hausnummer");
		lblHausnummer.setBounds(10, 156, 75, 15);
		
		Label lblPlz = new Label(shlLhwindow, SWT.NONE);
		lblPlz.setText("PLZ");
		lblPlz.setBounds(10, 198, 55, 15);
		
		Label lblOrt = new Label(shlLhwindow, SWT.NONE);
		lblOrt.setText("Ort");
		lblOrt.setBounds(10, 236, 55, 15);
		
		VornameTF = new Text(shlLhwindow, SWT.BORDER);
		VornameTF.setBounds(98, 38, 98, 21);
		
		NachnameTF = new Text(shlLhwindow, SWT.BORDER);
		NachnameTF.setBounds(98, 75, 98, 21);
		
		straﬂeTF = new Text(shlLhwindow, SWT.BORDER);
		straﬂeTF.setBounds(98, 114, 98, 21);
		
		hausnummerTF = new Text(shlLhwindow, SWT.BORDER);
		hausnummerTF.setBounds(98, 153, 98, 21);
		
		postleitzahlTF = new Text(shlLhwindow, SWT.BORDER);
		postleitzahlTF.setBounds(98, 195, 98, 21);
		
		ortTF = new Text(shlLhwindow, SWT.BORDER);
		ortTF.setText("");
		ortTF.setBounds(98, 233, 98, 21);
		
		Button btnAbbrechen = new Button(shlLhwindow, SWT.NONE);
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(349, 10, 75, 25);
		btnAbbrechen.setText("Abbrechen");
		
		Composite composite = new Composite(shlLhwindow, SWT.NONE);
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + " / " + me.y);
			}
		});
		composite.setBounds(221, 187, 191, 64);
		
		VornameTFout = new Label(shlLhwindow, SWT.NONE);
		VornameTFout.setBounds(221, 41, 55, 15);
		
		NachnameTFout = new Label(shlLhwindow, SWT.NONE);
		NachnameTFout.setBounds(221, 78, 55, 15);
		shlLhwindow.setTabList(new Control[]{VornameTF, NachnameTF, straﬂeTF, hausnummerTF, postleitzahlTF, ortTF, btnNewButton});

		shlLhwindow.open();
		shlLhwindow.layout();
		while (!shlLhwindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	public Text getVNTF() {
		return VornameTF;
	}
	public Text getNNTF() {
		return NachnameTF;
	}
	public Label getVornameTFout() {
		return VornameTFout;
	}
	public Label getNachnameTFout() {
		return NachnameTFout;
	}
}
