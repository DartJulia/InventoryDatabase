package com.adminform.AdminFormLab.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adminform.AdminFormLab.entity.Items;

@Repository
@Transactional
public class ItemDao {

	@PersistenceContext
	private EntityManager em;

//	public Items findByName(String name) {
//		return em.find(Items.class, name);
//	}
	public Items update(Items i) {

		return em.merge(i);
	}

}
