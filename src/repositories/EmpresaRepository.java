package repositories;

import entities.Empresa;

// Classe abstrata
public abstract class EmpresaRepository {

	// Metodos abstratos
	public abstract void exportar(Empresa empresa) throws Exception;

}
