package view.input;

import java.awt.Component;

import javax.swing.JButton;

/**
 * Interfejs za sva input polja koja pravimo. Definise
 * postavljanje i citanje vrijednosti polja.<br>U 99%
 * slucajeva konkretni Inputi trebaju biti JPanel komponenta.
 * @author Milan Vlaski
 *
 */
public interface Input{
 	Object getValue();
	void setValue(Object object);
	void setReferenceBtn(Component btn);
	void setEnabled(boolean enabled);
	
	boolean isPrimary();
	boolean isNullable();
	String getName();
}
