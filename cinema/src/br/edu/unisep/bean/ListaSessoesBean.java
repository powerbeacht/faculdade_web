package br.edu.unisep.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.unisep.model.dao.DAOGenerico;
import br.edu.unisep.model.vo.SessaoVO;

@ManagedBean
@RequestScoped
public class ListaSessoesBean {

	private List<SessaoVO> lista;

	@PostConstruct
	public void obterLista() {
		DAOGenerico<SessaoVO> dao = new DAOGenerico<SessaoVO>();
		this.lista = dao.listar(SessaoVO.class);
	}
	
	public String novaSessao() {
		return "novaSessao";
	}

	public List<SessaoVO> getLista() {
		return lista;
	}

	public void setLista(List<SessaoVO> lista) {
		this.lista = lista;
	}
}
