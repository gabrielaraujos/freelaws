package br.com.freela.freelaws.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.freela.freelaws.dao.DAO;

@Component
public class DAOImpl implements DAO, Serializable {

	private static final long serialVersionUID = -2885634253192889487L;

	// private static final EntityManagerFactory entityManager =
	// Persistence.createEntityManagerFactory("freelaDB");

	// public EntityManager getEntityManager() {
	// return entityManager.createEntityManager();
	// }
	//
	// public void fecharEntityManager() {
	// entityManager.close();
	// }

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
		// EntityManager manager = getEntityManager();
		//
		// EntityTransaction transaction = manager.getTransaction();
		//
		// transaction.begin();
		// manager.persist(object);
		// transaction.commit();
		//
		// manager.close();
		// fecharEntityManager();
	}

	@Override
	public void atualizar(Object object) {
		// TODO Auto-generated method stub

	}

}
