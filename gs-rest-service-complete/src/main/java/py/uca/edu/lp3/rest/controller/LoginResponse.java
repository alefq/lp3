package py.uca.edu.lp3.rest.controller;

import py.uca.edu.lp3.domain.Persona;

public class LoginResponse extends BaseResponse {

	private Persona principal;

	public Persona getPrincipal() {
		return principal;
	}

	public void setPrincipal(Persona principal) {
		this.principal = principal;
	}

}
