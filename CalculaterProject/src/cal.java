import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;


public class cal {

	protected Shell shell;
	private Text firstnotext;
	private Text secondnumtext;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			cal window = new cal();
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
		shell.setSize(711, 464);
		shell.setText("SWT Application");
		
		firstnotext = new Text(shell, SWT.BORDER);
		firstnotext.setBounds(349, 83, 168, 21);
		
		secondnumtext = new Text(shell, SWT.BORDER);
		secondnumtext.setBounds(349, 131, 168, 21);
		
		Label Firstnum = new Label(shell, SWT.NONE);
		Firstnum.setBounds(239, 86, 55, 15);
		Firstnum.setText("First Num");
		
		Label Secondno = new Label(shell, SWT.NONE);
		Secondno.setBounds(225, 134, 69, 15);
		Secondno.setText("Second Num");
		
	final	Label ans = new Label(shell, SWT.NONE);
		ans.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD | SWT.ITALIC));
		ans.setText("Your Answer is");
		ans.setBounds(349, 269, 197, 33);
		
		Button add = new Button(shell, SWT.NONE);
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int  num1,num2;
				try{		
			        num1=Integer.parseInt(firstnotext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				try{		
			        num2=Integer.parseInt(secondnumtext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				int an=num1+num2;
				ans.setText("The Answer is=>" +an);
				   }
		} );
		add.setBounds(219, 204, 75, 25);
		add.setText("add");
		
		Button Sub = new Button(shell, SWT.NONE);
		Sub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int  num1,num2;
				try{		
			        num1=Integer.parseInt(firstnotext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				try{		
			        num2=Integer.parseInt(secondnumtext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				int an=num1-num2;
				ans.setText("The Answer is=>" +an);
				   
			}
		});
		Sub.setText("sub");
		Sub.setBounds(317, 204, 75, 25);
		
		Button Mul = new Button(shell, SWT.NONE);
		Mul.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int  num1,num2;
				try{		
			        num1=Integer.parseInt(firstnotext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				try{		
			        num2=Integer.parseInt(secondnumtext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				int an=num1*num2;
				ans.setText("The Answer is=>" +an);
			}
		});
		Mul.setText("mul");
		Mul.setBounds(433, 204, 75, 25);
		
		Button Div = new Button(shell, SWT.NONE);
		Div.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int  num1,num2;
				try{		
			        num1=Integer.parseInt(firstnotext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				try{		
			        num2=Integer.parseInt(secondnumtext.getText());
			      }
			       catch(Exception ex)
		        	{
			         MessageDialog.openError(shell, "Error", "Plz provide num");
			         return;
		        	}
				int an=num1/num2;
				ans.setText("The Answer is=>" +an);
			}
		});
		Div.setText("div");
		Div.setBounds(530, 204, 75, 25);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Script MT Bold", 14, SWT.NORMAL));
		lblNewLabel.setBounds(197, 34, 363, 21);
		lblNewLabel.setText("Simple Calculater-Devlope by Sohan Singh");
		
		

	}
}
