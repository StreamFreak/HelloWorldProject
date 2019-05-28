package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Control;

public class GUIWIndow {

	protected Shell Lukas;
	private Text vornameTF;
	private Text nachnameTF;
	private Label vornameOut;
	private Label nachnameOut;
	private Button btnNewButton;

	/**
	 * Launch the application.
	 * 
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
		Lukas.open();
		Lukas.layout();
		while (!Lukas.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		Lukas= new Shell();
		Lukas.setSize(450, 300);
		Lukas.setText("SWT Application");

		Label lblVorname = new Label(Lukas, SWT.NONE);
		lblVorname.setBounds(10, 29, 55, 15);
		lblVorname.setText("Vorname");

		Label lblNachname = new Label(Lukas, SWT.NONE);
		lblNachname.setBounds(10, 72, 68, 15);
		lblNachname.setText("Nachname");

		vornameTF = new Text(Lukas, SWT.BORDER);
		vornameTF.setBounds(89, 23, 76, 21);

		nachnameTF = new Text(Lukas, SWT.BORDER);
		nachnameTF.setBounds(89, 69, 76, 21);

		vornameOut = new Label(Lukas, SWT.NONE);
		vornameOut.setBounds(189, 29, 55, 15);

		nachnameOut = new Label(Lukas, SWT.NONE);
		nachnameOut.setBounds(189, 72, 55, 15);

		Button btnButton = new Button(Lukas, SWT.NONE);
		btnButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getVornameOut().setText(getVornameTF().getText());
				getNachnameOut().setText(getNachnameTF().getText());
			}
		});
		btnButton.setBounds(349, 226, 75, 25);
		btnButton.setText("Speichern");

		btnNewButton = new Button(Lukas, SWT.NONE);
		btnNewButton.setBounds(268, 226, 75, 25);
		btnNewButton.setText("New Button");

		Button btnNewButton_1 = new Button(Lukas, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				//
				System.out.println(gson.toJson(Person.getListe()));
				//
				try {
					File jsonFile = File.createTempFile("wpfinf-json-", "humptydumpy");
					FileWriter fw = new FileWriter(jsonFile);
					//
					gson.toJson(Person.getListe(), fw);
					//
					fw.flush();
					fw.close();
					//
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1.setBounds(268, 198, 75, 25);
		btnNewButton_1.setText("JSON");
	
		
		
		Button btnLoad = new Button(Lukas, SWT.NONE);
		btnLoad.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			FileDialog fd = new FileDialog(Lukas, SWT.OPEN);
			//
			fd.setFilterExtensions(new String[] {"humptydumpty"});
			fd.setFilterPath("%TEMP%");
			//
			fd.open();
			}
		});
		btnLoad.setBounds(10, 226, 75, 25);
		btnLoad.setText("Load");
		Lukas.setTabList(new Control[] { nachnameTF, vornameTF, btnButton, btnNewButton, btnNewButton_1 });

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
