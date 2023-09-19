package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	private Vector<JButton> buttons = new Vector<>();

	private ActionListener planerListener;
	private ActionListener rezervacijeListener;
	private ActionListener vozilaListener;
	private ActionListener ugovoriListener;
	private ActionListener analitikaListener;
	private ActionListener zaposleniListener;
	private ActionListener podesavanjaListener;

	public Toolbar(ActionListener planerListener, ActionListener rezervacijeListener, ActionListener vozilaListener,
			ActionListener ugovoriListener, ActionListener analitikaListener, ActionListener zaposleniListener,
			ActionListener podesavanjaListener) {

		setFloatable(false);

		this.planerListener = planerListener;
		this.rezervacijeListener = rezervacijeListener;
		this.vozilaListener = vozilaListener;
		this.ugovoriListener = ugovoriListener;
		this.analitikaListener = analitikaListener;
		this.zaposleniListener = zaposleniListener;
		this.podesavanjaListener = podesavanjaListener;
		
		
		JButton planer = new JButton(new ImageIcon("icons/planer.png"));
		planer.setToolTipText("Planer");
		planer.setActionCommand("planer");
		planer.addActionListener(planerListener);

		JButton rezervacije = new JButton(new ImageIcon("icons/rezervacija.png"));
		rezervacije.setToolTipText("Rezervacije");
		rezervacije.setActionCommand("planer");
		rezervacije.addActionListener(rezervacijeListener);
		
		JButton vozila = new JButton(new ImageIcon("icons/vozilo.png"));
		vozila.setToolTipText("Vozila");
		vozila.setActionCommand("planer");
		vozila.addActionListener(vozilaListener);
		
		JButton ugovori = new JButton(new ImageIcon("icons/ugovor.png"));
		ugovori.setToolTipText("Ugovori");
		ugovori.setActionCommand("planer");
		ugovori.addActionListener(ugovoriListener);
		
		JButton analitika = new JButton(new ImageIcon("icons/analitika.png"));
		analitika.setToolTipText("Analitika");
		analitika.setActionCommand("planer");
		analitika.addActionListener(analitikaListener);
		
		JButton zaposleni = new JButton(new ImageIcon("icons/zaposleni.png"));
		zaposleni.setToolTipText("Zaposleni");
		zaposleni.setActionCommand("planer");
		zaposleni.addActionListener(zaposleniListener);
		
		JButton podesavanja = new JButton(new ImageIcon("icons/podesavanja.png"));
		podesavanja.setToolTipText("Podešavanja sistema");
		podesavanja.setActionCommand("planer");
		podesavanja.addActionListener(podesavanjaListener);
		
		add(planer);
		buttons.add(planer);
		add(rezervacije);
		buttons.add(rezervacije);
		add(vozila);
		buttons.add(vozila);
		add(ugovori);
		buttons.add(ugovori);
		add(analitika);
		buttons.add(analitika);
		add(zaposleni);
		buttons.add(zaposleni);
		add(podesavanja);
		buttons.add(podesavanja);
	}

	public Vector<JButton> getButtons() {
		return buttons;
	}

	public void setButtons(Vector<JButton> buttons) {
		this.buttons = buttons;
	}

}
