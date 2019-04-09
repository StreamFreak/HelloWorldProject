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
	private static Text VN;
	private static Text NN;
	private static Text STR;
	private static Text HN;
	private static Text PLZ;
	private static Text Ort;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlLhwindow = new Shell();
		shlLhwindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
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
				System.out.println(VN.getText());
				System.out.println(NN.getText());
				System.out.println(HN.getText());
				System.out.println(PLZ.getText());
				System.out.println(Ort.getText());
				System.out.println(STR.getText());
				
				
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
		
		VN = new Text(shlLhwindow, SWT.BORDER);
		VN.setBounds(98, 38, 98, 21);
		
		NN = new Text(shlLhwindow, SWT.BORDER);
		NN.setBounds(98, 75, 98, 21);
		
		STR = new Text(shlLhwindow, SWT.BORDER);
		STR.setBounds(98, 114, 98, 21);
		
		HN = new Text(shlLhwindow, SWT.BORDER);
		HN.setBounds(98, 153, 98, 21);
		
		PLZ = new Text(shlLhwindow, SWT.BORDER);
		PLZ.setBounds(98, 195, 98, 21);
		
		Ort = new Text(shlLhwindow, SWT.BORDER);
		Ort.setText("");
		Ort.setBounds(98, 233, 98, 21);
		
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
		shlLhwindow.setTabList(new Control[]{VN, NN, STR, HN, PLZ, Ort, btnNewButton});

		shlLhwindow.open();
		shlLhwindow.layout();
		while (!shlLhwindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
