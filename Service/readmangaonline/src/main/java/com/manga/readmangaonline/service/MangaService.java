package com.manga.readmangaonline.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manga.readmangaonline.model.Manga;
import com.manga.readmangaonline.repository.MangaRepo;


@Service
public class MangaService {
	
	@Autowired
	MangaRepo mangaRepo;

	public List<Manga> getAllUsers() {
		
		List<Manga> mangaList = new ArrayList<Manga>();
		mangaRepo.findAll().forEach(data -> mangaList.add(data));
		return mangaList;
	}
	
	public Manga getUserById(int id) {
		return mangaRepo.findById(id).get();
	}
	
	public void saveUser(Manga manga) {
		mangaRepo.save(manga);
	}
}
