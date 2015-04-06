import java.applet.Applet;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraWeb extends Applet implements ActionListener {
	private String cadena = " ";
	private String copia_cadena = " ";
	private char operador;
	private Button boton1, boton2, boton3, boton4, boton5, boton6, boton7,
			boton8, boton9, boton0, botonIgual, botonSuma, botonResta,
			botonMultiplicacion, botonDivision, botonComa, botonSigno,
			botonBorrarCifra, botonClean;
	private JTextField campoDeTexto;
	private double resultado = 0;

	public void init() {
		this.setLayout(new BorderLayout());

		Panel miPanel = new Panel();
		miPanel.setLayout(new GridLayout(5, 3, 2, 2));
		campoDeTexto = new JTextField("0", 20);
		campoDeTexto.setHorizontalAlignment(SwingConstants.RIGHT);

		boton1 = new Button("1");
		boton2 = new Button("2");
		boton3 = new Button("3");
		boton4 = new Button("4");
		boton5 = new Button("5");
		boton6 = new Button("6");
		boton7 = new Button("7");
		boton8 = new Button("8");
		boton9 = new Button("9");
		boton0 = new Button("0");
		botonIgual = new Button("=");
		botonSuma = new Button("+");
		botonResta = new Button("-");
		botonMultiplicacion = new Button("*");
		botonDivision = new Button("/");
		botonComa = new Button(".");
		botonSigno = new Button("+/-");
		botonBorrarCifra = new Button("<-");
		botonClean = new Button("C");
		miPanel.add(boton1);
		miPanel.add(boton2);
		miPanel.add(boton3);
		miPanel.add(boton4);
		miPanel.add(boton5);
		miPanel.add(boton6);
		miPanel.add(boton7);
		miPanel.add(boton8);
		miPanel.add(boton9);
		miPanel.add(boton0);
		miPanel.add(botonSuma);
		miPanel.add(botonResta);
		miPanel.add(botonMultiplicacion);
		miPanel.add(botonDivision);
		miPanel.add(botonComa);
		miPanel.add(botonSigno);
		miPanel.add(botonBorrarCifra);
		miPanel.add(botonClean);
		miPanel.add(botonIgual);
		add(campoDeTexto, BorderLayout.NORTH);
		add(miPanel, BorderLayout.CENTER);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);
		boton6.addActionListener(this);
		boton7.addActionListener(this);
		boton8.addActionListener(this);
		boton9.addActionListener(this);
		boton0.addActionListener(this);
		botonIgual.addActionListener(this);
		botonSuma.addActionListener(this);
		botonResta.addActionListener(this);
		botonMultiplicacion.addActionListener(this);
		botonDivision.addActionListener(this);
		botonComa.addActionListener(this);
		botonSigno.addActionListener(this);
		botonBorrarCifra.addActionListener(this);
		botonClean.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			this.cadena = this.cadena.concat("1");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton2) {
			this.cadena = this.cadena.concat("2");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton3) {
			this.cadena = this.cadena.concat("3");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton4) {
			this.cadena = this.cadena.concat("4");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton5) {
			this.cadena = this.cadena.concat("5");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton6) {
			this.cadena = this.cadena.concat("6");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton7) {
			this.cadena = this.cadena.concat("7");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton8) {
			this.cadena = this.cadena.concat("8");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton9) {
			this.cadena = this.cadena.concat("9");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == boton0) {
			this.cadena = this.cadena.concat("0");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == botonComa) {
			this.cadena = this.cadena.concat(".");
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == botonSuma) {
			this.operador = '+';
			this.copiarCadena();
		}
		if (e.getSource() == botonResta) {
			this.operador = '-';
			this.copiarCadena();
		}
		if (e.getSource() == botonMultiplicacion) {
			this.operador = '*';
			this.copiarCadena();
		}
		if (e.getSource() == botonDivision) {
			this.operador = '/';
			this.copiarCadena();
		}
		if (e.getSource() == botonSigno) {
			Double doble = Double.parseDouble(this.cadena);
			doble = doble * (-1);
			this.cadena = doble.toString();
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == botonBorrarCifra) {
			this.cadena = this.cadena.substring(0, this.cadena.length() - 1);
			this.campoDeTexto.setText(this.cadena);
		}
		if (e.getSource() == botonClean) {
			this.cadena = " ";
			this.copia_cadena = " ";
			this.campoDeTexto.setText("0");
		}

		if (e.getSource() == botonIgual) {
			if (this.copia_cadena.equals(" ")) {
				if (this.copia_cadena.equals(" ") && this.cadena.equals(" ")) {
					campoDeTexto.setText("0");
				} else {
					Double doble = new Double(this.cadena);
					this.campoDeTexto.setText(doble.toString());
				}
			} else {
				this.calcular();
				Double doble = new Double(this.resultado);
				this.campoDeTexto.setText(doble.toString());
			}
			this.cadena = " ";
			this.copia_cadena = " ";
			this.resultado = 0;
		}
	}

	public void copiarCadena() {
		this.copia_cadena = this.cadena;
		this.cadena = " ";
	}

	public void calcular() {

		double numero1 = Double.parseDouble(cadena);
		double numero2 = Double.parseDouble(copia_cadena);
		double numero3 = 0;

		switch (operador) {
		case '+':
			numero3 = numero1 + numero2;
			break;
		case '-':
			numero3 = numero2 - numero1;
			break;
		case '/':
			if (numero1 != 0) {
				numero3 = numero2 / numero1;
			} else {
				this.campoDeTexto.setText("ERROR");
			}
			break;
		case '*':
			numero3 = numero2 * numero1;
			break;

		}
		this.resultado = numero3;
	}
}
