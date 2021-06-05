package com.manga.readmangaonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manga.readmangaonline.model.Manga;
import com.manga.readmangaonline.service.MangaService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MangaController {
	@Autowired
	MangaService mangaService;
	
	@GetMapping("/mangaList")
	private List<Manga> mangaList() {
		return mangaService.getAllUsers();
	}
}
