package Empresa;

import java.util.Objects;

public class Funcionarios {

	public Integer idFunc;
	public String nomeFunc;
	
	public Funcionarios() {
			
						
	}

	public Funcionarios(Integer idFunc, String nomeFunc) {
		super();
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
	}

	public Integer getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(Integer idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomefunc() {
		return nomeFunc;
	}

	public void setNomefunc(String nomefunc) {
		this.nomeFunc = nomefunc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFunc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionarios other = (Funcionarios) obj;
		return Objects.equals(idFunc, other.idFunc);
	}
	
	
}
