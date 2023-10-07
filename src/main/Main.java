package main;

import controllers.EmpresaController;

public class Main {

	public static void main(String[] args) {
	
		// Executar o controlador 
		EmpresaController empresa = new EmpresaController();
		empresa.cadastrarEmpresa();

	}

}
