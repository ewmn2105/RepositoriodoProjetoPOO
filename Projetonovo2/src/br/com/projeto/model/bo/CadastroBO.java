package br.com.projeto.model.bo;
import java.sql.Connection;

import br.com.projeto.model.dao.CadastroDAO;
import br.com.projeto.model.vo.CadastroVO;
public class CadastroBO{
	private CadastroDAO cadastroDAO;
	public CadastroBO() {
		cadastroDAO = new CadastroDAO();
	}
	public boolean cadLogin (CadastroVO novologin) {
		return cadastroDAO.novocad(novologin);
	}
}

