package clases_ejercico_clase_3;

public class Coche {
	private String marca;
	private String modelo;
	private int cv;
	private int cc;
	private int deposito;
	private int km;
	private String matricula;

	public Coche(String marca, String modelo, int cv, int cc, int deposito, int km, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.cc = cc;
		this.deposito = deposito;
		this.km = km;
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		if (cv > 0) {
			this.cv = cv;
		} else {
			System.out.println("El numero tiene que ser mayor de 0");
		}
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		if (cc > 0) {
			this.cc = cc;
		} else {
			System.out.println("El numero tiene que ser mayor de 0");
		}
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		if (deposito > 30) {
			this.deposito = deposito;
		} else {
			System.out.println("El numero tiene que ser mayor de 30");
		}
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		if (km >= 0) {
			this.km = km;
		} else {
			System.out.println("El numero tiene que ser mayor o igual que 0");
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Coche(String marca, String modelo, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	public Coche() {
		super();
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", cv=" + cv + ", cc=" + cc + ", deposito=" + deposito
				+ ", km=" + km + ", matricula=" + matricula + "]";
	}

}
