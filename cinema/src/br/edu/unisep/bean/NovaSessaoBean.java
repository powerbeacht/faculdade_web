package br.edu.unisep.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.unisep.model.dao.DAOGenerico;
import br.edu.unisep.model.vo.FilmeVO;
import br.edu.unisep.model.vo.SessaoVO;

@ManagedBean
@RequestScoped
public class NovaSessaoBean {

	private SessaoVO sessao;

	private List<FilmeVO> filmes;

	@PostConstruct
	public void obterFilmes() {
		DAOGenerico<FilmeVO> dao = new DAOGenerico<FilmeVO>();
		this.filmes = dao.listar(FilmeVO.class);
	}

	public SessaoVO getSessao() {
		return sessao;
	}

	public void setSessao(SessaoVO sessao) {
		this.sessao = sessao;
	}

	public List<FilmeVO> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<FilmeVO> filmes) {
		this.filmes = filmes;
	}

}
