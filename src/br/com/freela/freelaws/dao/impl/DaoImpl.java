package br.com.freela.freelaws.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.freela.freelaws.dao.Dao;

public class DaoImpl implements Dao {

	private static final EntityManagerFactory entityManager = Persistence.createEntityManagerFactory("freelaDB");

	public EntityManager getEntityManager() {
		return entityManager.createEntityManager();
	}

	@Override
	public List<Object> pesquisarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pesquisarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerPorId(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inserir(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Object object) {
		// TODO Auto-generated method stub

	}

}
