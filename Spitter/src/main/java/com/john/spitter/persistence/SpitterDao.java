package com.john.spitter.persistence;

import com.john.spitter.domain.Spitter;

public interface SpitterDao {
	public void addSpitter(Spitter spitter);
	public Spitter getSpitterById(long id);
	public void saveSpitter(Spitter spitter);
}
