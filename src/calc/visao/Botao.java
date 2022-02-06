package calc.visao;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.*; 

@SuppressWarnings("serial")
public class Botao extends JButton{
	
	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("arial", Font.PLAIN, 24));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}