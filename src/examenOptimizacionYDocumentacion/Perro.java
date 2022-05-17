package com.acb.eed.examen.OptimizacionYDocumentacion;

/**
 * Clase perro que a su vez tiene la clase extendida mascota
 * 
 * @author Antonio Carmona Bascon
 *
 */
public class Perro extends Mascota {
	private int age;
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}

	/**
	 * Controla la edad que tiene, si es negativa o erronea, lanza la excepcion
	 * 
	 * @param age edad
	 * @throws EdadErroneaException lanza excepcion
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	/**
	 * Recoge y devuelve la edad
	 * 
	 * @return this.age devuelve la edad
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * El perro ladra
	 * 
	 * @return "GUAUUUUUUUUUU" devuelve el mensaje
	 */
	public static String ladrar() {
		return "GUAUUUUUUUUUU";
	}

}
