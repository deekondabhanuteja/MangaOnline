package com.manga.readmangaonline.repository;

import org.springframework.data.repository.CrudRepository;

import com.manga.readmangaonline.model.Manga;


public interface MangaRepo extends CrudRepository<Manga, Integer>{
		
}
