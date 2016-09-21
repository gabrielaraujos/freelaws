package br.com.freela.freelaws.dao;

import java.util.List;

import javax.persistence.EntityManager;

public interface Dao {
	public EntityManager getEntityManager();

	public List<Object> pesquisarTodos();

	public Object pesquisarPorId(Long id);

	public void removerPorId(Long id);

	public void inserir(Object object);

	public void atualizar(Object object);
}
