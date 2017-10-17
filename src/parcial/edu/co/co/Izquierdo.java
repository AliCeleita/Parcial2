package parcial.edu.co.co;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Izquierdo extends JPanel{
	public JLabel icono,registro,nom,ape,tipo,num,edad,peso,alt,cel,dir,pues;
	public JTextField nom2,ape2,num2,edad2,peso2,alt2,cel2,dir2;
	public JComboBox tipo2,pues2;
	public JButton agregar;
	
	public Izquierdo() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints cons = new GridBagConstraints( );
		cons.gridx = 1;
        cons.gridy = 0;
        cons.fill = GridBagConstraints.NONE;
        Insets insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        icono=new JLabel();
		ImageIcon l1 = new ImageIcon( "img/medallas.jpg" );
		icono.setIcon(l1);
		this.add(icono,cons);
		
		cons.gridx = 0;
        cons.gridy = 1;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        nom=new JLabel("Nombre");
        this.add(nom,cons);
        
        cons.gridx = 1;
        cons.gridy = 1;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        nom2=new JTextField();
        this.add(nom2,cons);
        
        cons.gridx = 0;
        cons.gridy = 2;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        ape=new JLabel("Apellido");
        this.add(ape,cons);
        
        cons.gridx = 1;
        cons.gridy = 2;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        ape2=new JTextField();
        this.add(ape2,cons);
        
        cons.gridx = 0;
        cons.gridy = 3;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        tipo=new JLabel("Tipo");
        this.add(tipo,cons);
        
        cons.gridx = 1;
        cons.gridy = 3;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        tipo2=new JComboBox();
        tipo2.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar","Cedula","Tarjeta de identidad","Registro civil","Pasaporte"}));
        tipo2.setSelectedIndex(0);
        tipo2.setBounds(10, 260, 150, 20);
        this.add(tipo2,cons);
        
        cons.gridx = 0;
        cons.gridy = 4;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        num=new JLabel("Numero");
        this.add(num,cons);
        
        cons.gridx = 1;
        cons.gridy = 4;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        num2=new JTextField();
        this.add(num2,cons);
        
        cons.gridx = 0;
        cons.gridy = 5;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        edad=new JLabel("Edad");
        this.add(edad,cons);

        cons.gridx = 1;
        cons.gridy = 5;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        edad2=new JTextField();
        this.add(edad2,cons);
        
        cons.gridx = 0;
        cons.gridy = 6;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        peso=new JLabel("Peso");
        this.add(peso,cons);
        
        cons.gridx = 1;
        cons.gridy = 6;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        peso2=new JTextField();
        this.add(peso2,cons);
        
        cons.gridx = 0;
        cons.gridy = 7;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        alt=new JLabel("Altura");
        this.add(alt,cons);
        
        cons.gridx = 1;
        cons.gridy = 7;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        alt2=new JTextField();
        this.add(alt2,cons);
        
        cons.gridx = 0;
        cons.gridy = 8;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        cel=new JLabel("Celular");
        this.add(cel,cons);
        
        cons.gridx = 1;
        cons.gridy = 8;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        cel2=new JTextField();
        this.add(cel2,cons);
        
        cons.gridx = 0;
        cons.gridy = 9;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        dir=new JLabel("Direccion");
        this.add(dir,cons);

        cons.gridx = 1;
        cons.gridy = 9;
        cons.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        dir2=new JTextField();
        this.add(dir2,cons);
        
        cons.gridx = 0;
        cons.gridy = 10;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        pues=new JLabel("Puesto");
        this.add(pues,cons);
        
        cons.gridx = 1;
        cons.gridy = 10;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        pues2=new JComboBox();
        pues2.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar","Primer Lugar","Segundo Lugar","Tercer Lugar"}));
        pues2.setSelectedIndex(0);
        pues2.setBounds(10, 260, 150, 20);
        this.add(pues2,cons);
        
        cons.gridx = 1;
        cons.gridy = 11;
        cons.fill = GridBagConstraints.NONE;
        insets = new Insets( 5, 10, 5, 10 );
        cons.insets = insets;
        agregar=new JButton("Agregar");
        this.add(agregar,cons);
	}
	
}
