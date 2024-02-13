package com.lib;

public interface Library {
	void addBook();
	void updateBook();
	boolean deleteBook();
	void searchBookById();
	void searchBookByName();
	void showBooks();
	void exit();
}
