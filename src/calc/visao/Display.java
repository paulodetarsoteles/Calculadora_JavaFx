package calc.visao;

import javax.swing.JLabel;
import javax.swing.JPanel;

import calc.modelo.Memoria;
import calc.modelo.MemoriaObservador;

import java.awt.*;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private final JLabel label; 
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("arial", Font.PLAIN, 32));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 18)); 
		
		add(label); 
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}