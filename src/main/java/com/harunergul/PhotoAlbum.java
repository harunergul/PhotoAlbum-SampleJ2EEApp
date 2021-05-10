package com.harunergul;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

public class PhotoAlbum {

	public static String ATTRIBUTE_NAME = "PHOTO_ALBUM";
	private List<byte[]> photoDataList = new ArrayList<>();
	private List<String> names = new ArrayList<>();

	public static PhotoAlbum getPhotoAlbum(ServletContext servletContext) {

		if (servletContext.getAttribute(ATTRIBUTE_NAME) == null) {
			PhotoAlbum pa = new PhotoAlbum();
			servletContext.setAttribute(ATTRIBUTE_NAME, pa);
		}

		return (PhotoAlbum) servletContext.getAttribute(ATTRIBUTE_NAME);

	}

	public synchronized void addPhoto(String name, byte[] bytes) {
		this.photoDataList.add(bytes);
		this.names.add(name);
	}

	public synchronized void removePhoto(int index) {
		this.photoDataList.remove(index);
		this.names.remove(index);
	}
	
	public String getPhotoName(int index) {
		return this.names.get(index);
	}
	
	public int getPhotoCount() {
		return this.names.size();
	}
	
	 
}
