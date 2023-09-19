
package view.statusbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ApplicationModel;
import view.Fonts;

/**
 * Definiše statusnu traku koja prati stanja aplikacije, trenutno selektovani
 * red i vrijeme.
 * 
 * @author Tamara Borovina
 * @version 1.0
 *
 */
public class StatusBar extends JPanel {

	private static final long serialVersionUID = 1L;

	protected JPanel leftPanel;
	protected JPanel centerPanel;
	protected JPanel rightPanel;
	private static TimerThread thread = null;
	private JLabel leftLabel = null;
	private JLabel statusLabel;

	public static void terminateTimeThread() {
		if (thread != null)
			thread.setRunning(false);
	}

	public StatusBar() {
		createPartControl();
		this.statusLabel = new JLabel("Ready");

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(Fonts.INPUT_TEXT);
		dateLabel.setForeground(Color.GRAY);
		dateLabel.setHorizontalAlignment(JLabel.CENTER);
		this.addRightComponent(dateLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setFont(Fonts.INPUT_TEXT);
		timeLabel.setForeground(Color.GRAY);
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		this.addRightComponent(timeLabel);

		statusLabel.setFont(Fonts.INPUT_TEXT);
		statusLabel.setForeground(Color.GRAY);
		this.setLeftComponent(statusLabel);

		thread = new TimerThread(dateLabel, timeLabel);
		thread.start();

	}

	public void setStatusMessage(String message) {
		statusLabel.setText(message);
	}

	protected void createPartControl() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(getWidth(), 29));

		leftPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 3));
		leftPanel.setOpaque(false);
		add(leftPanel, BorderLayout.WEST);

		centerPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 3));
		centerPanel.setOpaque(false);
		add(centerPanel, BorderLayout.CENTER);

		rightPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 3));
		rightPanel.setOpaque(false);
		add(rightPanel, BorderLayout.EAST);

	}

	public void setLeftComponent(JComponent component) {
		leftPanel.removeAll();
		leftPanel.add(component);
	}

	public void setCenterComponent(JComponent component) {

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 0));
		panel.add(new SeparatorPanel(Color.GRAY, Color.WHITE));
		panel.add(component);

		centerPanel.removeAll();
		centerPanel.add(panel);
	}

	public void addRightComponent(JComponent component) {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 0));
		panel.add(new SeparatorPanel(Color.GRAY, Color.WHITE));
		panel.add(component);
		rightPanel.add(panel);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int y = 0;
		g.setColor(new Color(70, 97, 78));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180, 248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180, 248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180, 248, 200));
		g.drawLine(0, y, getWidth(), y);

		y = getHeight() - 3;

		g.setColor(new Color(180, 248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180, 248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(70, 97, 78));
		g.drawLine(0, y, getWidth(), y);
	}

}