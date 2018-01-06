import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Example extends Applet {

	public void paint (Graphics g) {
		//You will need to add each piece of code like it is a component. 
		//If you would like to intigrate computational heavy code, decouple the abstraction from the implementation, so both can vary independently. 
      g.drawString("google.com", 300, 150);
    }//end init

}//end class