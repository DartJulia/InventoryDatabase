package com.adminform.AdminFormLab.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adminform.AdminFormLab.entity.Items;

public interface ItemRepository extends JpaRepository<Items, Long> {




}
