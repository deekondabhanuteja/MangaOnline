package com.manga.readmangaonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Manga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manga_id")
	private int mangaId;
	
	@Column(name = "manga_name")
	private String mangaName;
	
	@Column(name = "manga_description")
	private String mangaDiscription;
	
	@Column(name = "manga_first_look")
	private String mangaCoverPick;

	public int getMangaId() {
		return mangaId;
	}

	public void setMangaId(int mangaId) {
		this.mangaId = mangaId;
	}

	public String getMangaName() {
		return mangaName;
	}

	public void setMangaName(String mangaName) {
		this.mangaName = mangaName;
	}

	public String getMangaDiscription() {
		return mangaDiscription;
	}

	public void setMangaDiscription(String mangaDiscription) {
		this.mangaDiscription = mangaDiscription;
	}

	public String getMangaCoverPick() {
		return mangaCoverPick;
	}

	public void setMangaCoverPick(String mangaCoverPick) {
		this.mangaCoverPick = mangaCoverPick;
	}
}
