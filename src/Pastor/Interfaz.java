package Pastor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textDestino;
	private JTextField textFieldTipoViaje;
	private JTextField textFieldPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("opciones");
		menuBar.add(mnMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Tarifa");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("\nTARIFARIO PROMEDIO: ");
				Pago p1 = new Pago();
				p1.mostrar();
			}
		});
		mnMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Empresas");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("\nEMPRESAS DISPONIBLES");
				Empresa e2 = new Empresa();
				e2.mostrar();
			}
		});
		mnMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUsuario = new JButton("Crear");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u1 = new Usuario();
				u1.mostrar();
			}
		});
		btnUsuario.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnUsuario.setBounds(95, 55, 89, 23);
		contentPane.add(btnUsuario);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setForeground(Color.LIGHT_GRAY);
		lblEmpresa.setFont(new Font("adineue PRO", Font.PLAIN, 15));
		lblEmpresa.setBounds(30, 104, 113, 14);
		contentPane.add(lblEmpresa);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empresa e3 = new Empresa();
				e3.mostrar();
			}
		});
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnNewButton.setBounds(95, 99, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.LIGHT_GRAY);
		lblUsuario.setFont(new Font("adineue PRO", Font.PLAIN, 15));
		lblUsuario.setBounds(42, 60, 113, 14);
		contentPane.add(lblUsuario);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setBounds(307, 120, 86, 20);
		contentPane.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldTipoViaje = new JTextField();
		textFieldTipoViaje.setBounds(307, 56, 86, 20);
		contentPane.add(textFieldTipoViaje);
		textFieldTipoViaje.setColumns(10);
		
		JLabel lblTarifario = new JLabel("Precio");
		lblTarifario.setForeground(Color.LIGHT_GRAY);
		lblTarifario.setFont(new Font("adineue PRO", Font.PLAIN, 14));
		lblTarifario.setBounds(241, 124, 113, 14);
		contentPane.add(lblTarifario);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Viaje v1 = new Viaje();
				v1.setDestino(textDestino.getText());
				double precio = Double.parseDouble(textFieldPrecio.getText());
				v1.setTarifa(precio);
				v1.setTipo(textFieldTipoViaje.getText());
				v1.mostrar();
			}
		});
		btnComprar.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnComprar.setBounds(304, 164, 89, 23);
		contentPane.add(btnComprar);
		
		textDestino = new JTextField();
		textDestino.setBounds(307, 89, 86, 20);
		contentPane.add(textDestino);
		textDestino.setColumns(10);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setForeground(Color.LIGHT_GRAY);
		lblDestino.setFont(new Font("adineue PRO", Font.PLAIN, 14));
		lblDestino.setBounds(231, 87, 113, 14);
		contentPane.add(lblDestino);
		
		JLabel lblTipodeViaje = new JLabel("Tipo de Viaje");
		lblTipodeViaje.setForeground(Color.LIGHT_GRAY);
		lblTipodeViaje.setFont(new Font("adineue PRO", Font.PLAIN, 15));
		lblTipodeViaje.setBounds(197, 60, 113, 14);
		contentPane.add(lblTipodeViaje);
		
		JLabel lblTituloprincipal = new JLabel("Pastor.com");
		lblTituloprincipal.setFont(new Font("adineue PRO Black Web", Font.BOLD, 17));
		lblTituloprincipal.setForeground(Color.WHITE);
		lblTituloprincipal.setBounds(42, 0, 226, 22);
		contentPane.add(lblTituloprincipal);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\andru\\OneDrive\\Documentos\\NetBeansProjects\\LAB121F\\src\\Pastor\\Pastor.com.png"));
		lblFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblFondo);
	}
}
