package com.github.matiasmartearena.clase06.Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Crear empleados iniciales

		// EmpleadoComision (dni, nombre, apellido, ingreso, salario, clientes, monto)
		EmpleadoComision emp1 = new EmpleadoComision(40123456, "Juan", "Perez", 2020, 0, 10, 1500);
		// EmpleadoFijo (dni, nombre, apellido, ingreso, salario)
		EmpleadoFijo emp2 = new EmpleadoFijo(25688775, "Ana", "Gomez", 2018, 35000);

		// Crear lista de empleados
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(emp1);
		empleados.add(emp2);

		// Crear instancia de Empresa (lista de empleados)
		Empresa empresa = new Empresa(empleados);

		// Mostrar salarios antes de agregar nuevos empleados
		empresa.mostrarSalarios();

		// Agregar un nuevo empleado a comisión
		EmpleadoComision emp3 = new EmpleadoComision(37890098, "Luis", "Martinez", 2022, 0, 5, 2000);
		empresa.agregarEmpleado(emp3);

		// Agregar un nuevo empleado fijo
		EmpleadoFijo emp4 = new EmpleadoFijo(24567890, "Laura", "Fernandez", 2019, 35000);
		empresa.agregarEmpleado(emp4);

		// Mostrar salarios después de agregar nuevos empleados
		empresa.mostrarSalarios();

		// Mostrar empleado con mas clientes
		EmpleadoComision topEmpleado = (EmpleadoComision) empresa.empleadoConMasClientes();
		if (topEmpleado != null) {
			System.out.println("Empleado con mayor número de clientes: " + topEmpleado.getNombreCompleto() + " con "
					+ topEmpleado.getClientes() + " clientes.");
		} else {
			System.out.println("No hay empleados a comisión.");
		}
	}
}
