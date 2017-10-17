package parcial.edu.co.co;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Componentes extends JFrame{
	public Componentes(String titulo){
		 super(titulo);
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		
	}
	
	public Componentes iniciar(){
				
			Dimension dims = new Dimension(600, 450);
			this.setSize(dims);
			this.setPreferredSize(dims);
			this.getContentPane( ).setLayout( new BorderLayout( ) );
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			return this;
	}
	
	public void componente() {
		
	}

}
