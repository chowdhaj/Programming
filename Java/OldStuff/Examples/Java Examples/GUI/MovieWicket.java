// The "MovieWicket" class.
import java.applet.*;
import java.awt.*;
import java.text.*;

public class MovieWicket extends Applet
{

static final double ADULT_PRICE = 8.00;
static final double CHILD_PRICE = 3.50;
static final double SENIOR_PRICE = 4.50;

Button adultButton, seniorButton, childButton;
Button clearButton, printButton;

Label runningTotalLabel, totalLabel;
TextField runningTotalTextField;
TextArea totalTextArea;

int adults = 0, seniors = 0, children = 0;
double total = 0;

//Called by the system when the applet is loaded.
   
    public void init ()
    {
    
    //set properties of the applet
    setLayout (new BorderLayout ());
    
    //create all the components in the applet.
    //the spaces around "adult" are used to create a wider button
    adultButton = new Button ("    Adult    ");
    seniorButton = new Button ("Senior");
    childButton = new Button ("Child");
    clearButton = new Button ("Clear");
    runningTotalLabel = new Label ("Running Total");
    runningTotalLabel.setAlignment (Label.RIGHT);
    runningTotalTextField = new TextField("  Print Ticker  ");
    runningTotalTextField = new TextField ("0.00");
    printButton = new Button ("  Print Ticket  ");
    totalLabel = new Label ("Total");
    totalLabel.setAlignment (Label.CENTER);
    totalLabel.setFont (new Font ("Dialog",Font.BOLD,24));
    totalTextArea = new TextArea (7,25); //7 rows 25 collums
    
    //layout the four buttons on the left in a panel
    Panel westPanel = new Panel ();
    westPanel.setLayout (new GridLayout (0,1,30,40));
    westPanel.add (adultButton);
    westPanel.add (seniorButton);
    westPanel.add (childButton);
    westPanel.add (clearButton);
    
    //place westPanel into the applet
    add ("West",westPanel);
    
    //Layout the running total label and text field.
    Panel runningTotalPanel = new Panel ();
    runningTotalPanel.add (runningTotalLabel);
    runningTotalPanel.add (runningTotalTextField);
    
    //Place the "Print Ticket" button in its own panel so that t
    //wont be resized to fit the entire central area.
    Panel printPanel = new Panel ();
    printPanel.add (printButton);
    
    //layout the total text area and the label above it.
    Panel totalPanel = new Panel ();
    totalPanel.setLayout (new BorderLayout ());
    totalPanel.add ("North",totalLabel);
    totalPanel.add("South",totalTextArea);
    
    //palce all threepanels in a panel covering the right hand side.
    Panel eastPanel = new Panel ();
    eastPanel.setLayout (new BorderLayout ());
    eastPanel.add ("North", runningTotalPanel);
    eastPanel.add("Center", printPanel);
    eastPanel.add("South", totalPanel);
    
    //place eastPanel into the applet.
    add ("East", eastPanel);
    
    //used to force layout manager to give 20 pixels
    
    
     /*MovieWicket class*/
    
	// Place the body of the initialization method here
    } // init method
    public Insets insets ()
    {return (new Insets (20,20,20,20));
    }
      
    
    //ACTIONS
    
    public boolean action (Event evt, Object arg)
    {
    //If the user pressed a button, call the associated method.
    if (evt.target==adultButton)
    addAdult ();
    else if (evt.target==seniorButton)
    addSenior();
    else if (evt.target==childButton)
    addChild();
    else if (evt.target==printButton)
    printTicket ();
    else if (evt.target== clearButton)
    clearAll ();
    else
    return false;
    
    return true;
    
    }//action method
    
    //Called when the user pressed the "Adult" button.
    protected void addAdult ()
    {
    //Increment the adult counter.
    adults++;
    
    //Add to the total.
    total+=ADULT_PRICE;
    
    //Dsiplay the new total.
    NumberFormat form=new DecimalFormat ("0.00");
    runningTotalTextField.setText (form.format(total));
    
    //Clear the previously printed ticket.
    totalTextArea.setText("");
    }//addAdult method
    
    //Called when the user pressed the "Child" button.
    protected void addChild ()
    {
    //Increment the adult counter.
    children++;
    
    //Add the total.
    total+=CHILD_PRICE;
    
    //Display the new total.
    NumberFormat form = new DecimalFormat ("0.00");
    
    runningTotalTextField.setText (form.format (total));
    
    //Clear the previously printed ticket.
    totalTextArea.setText ("");
    }//addChild method
    
    //Called when the user pressed the "Senior" button.
    protected void addSenior ()
    {
    //Increment the adult counter.
    seniors++;
    
    //Add to the total.
    
    total+=SENIOR_PRICE;
    
    //Display the new total.
    NumberFormat form=new DecimalFormat ("0.00");
    runningTotalTextField.setText (form.format (total));
    
    //Clear the previously printed ticket.
    totalTextArea.setText ("");
    }//addSenior method
    
    //Called when the user pressed the "Clear" button.
    protected void clearAll ()
    {
    //Reset the counters and the total.
    adults=0;
    seniors=0;
    children=0;
    total=0;
    
    //Display thenew running total.
    runningTotalTextField.setText ("0.00");
    
    //Clear the printed ticket.
    totalTextArea.setText ("");
    }//clearAll method
    
    //Called when the user pressed the "Print Ticket" button.
    protected void printTicket ()
    {
    //Display the values of the counters and the total in the 
    //total text area.
    String result;
    NumberFormat form= new DecimalFormat ("0.00");
    result= "Adults: " + adults + "\nSeniors: " + seniors+ "\nChildren: " + children + "\nTotal: " + form.format(total);
    totalTextArea.setText (result);
    
    //Reset the counters and the totla now that the ticket is printed.
    adults=0;
    seniors=0;
    children=0;
    total=0;
    }//printTicket method.
    
    
    
    public void paint (Graphics g)
    {
	// Place the body of the drawing method here
    } // paint method
} // MovieWicket class

