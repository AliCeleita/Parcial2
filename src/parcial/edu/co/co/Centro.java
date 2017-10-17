package parcial.edu.co.co;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Centro extends JPanel{
	public JLabel imagen1,imagen2,imagen3,datos1,datos2,datos3,oro,plata,bronce;
	public JButton mostrar;
	public Centro(){
		this.setLayout(new GridBagLayout());
		GridBagConstraints cons = new GridBagConstraints( );
		cons.gridx = 0;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.BOTH;
        Insets insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        datos1= new JLabel();
        this.add(datos1,cons);
        
        cons.gridx = 1;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        imagen1= new JLabel();
        ImageIcon l1 = new ImageIcon( "img/medoro.jpg" );
		imagen1.setIcon(l1);
        this.add(imagen1,cons);
        
        cons.gridx = 1;
        cons.gridy = 2;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        oro= new JLabel("Medalla Oro");
        this.add(oro,cons);
        
        cons.gridx = 0;
        cons.gridy = 3;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        imagen2= new JLabel();
        ImageIcon l2 = new ImageIcon( "img/medplata.jpg" );
		imagen2.setIcon(l2);
        this.add(imagen2,cons);
        
        cons.gridx = 1;
        cons.gridy =3;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        datos2= new JLabel();
        this.add(datos2,cons);
        
        cons.gridx = 0;
        cons.gridy = 4;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        plata= new JLabel("Medalla Plata");
        this.add(plata,cons);
        
        cons.gridx = 0;
        cons.gridy = 5;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        datos3= new JLabel();
        this.add(datos3,cons);
        
        cons.gridx = 1;
        cons.gridy = 5;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        imagen3= new JLabel();
        ImageIcon l3 = new ImageIcon( "img/medbronce.jpg" );
		imagen3.setIcon(l3);
        this.add(imagen3,cons);
        
        cons.gridx = 1;
        cons.gridy = 6;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        bronce= new JLabel("Medalla Bronce");
        this.add(bronce,cons);
        
        cons.gridx = 1;
        cons.gridy = 7;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        mostrar= new JButton("Mostrar Medallistas");
        this.add(mostrar,cons);
	}
}
