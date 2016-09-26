package br.com.freela.freelaws.dao;

import java.util.List;

//@Repository
public interface DAO {
	// public EntityManager getEntityManager();

	public List<Object> pesquisarTodos();

	public Object pesquisarPorId(Long id);

	public void removerPorId(Long id);

	public void inserir(Object object);

	public void atualizar(Object object);
}
