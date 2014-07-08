package com.indecisive.meshidoko.models;


public class Restaurant {

	private int id;

	private String name;

	private String address;

	private String imageUrl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Restaurant(int id, String name, String address, String imageUrl) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.imageUrl = imageUrl;
	}
}