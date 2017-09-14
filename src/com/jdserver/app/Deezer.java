package com.jdserver.app;

import com.google.gson.annotations.SerializedName;

public class Deezer {
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	/*public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}*/
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPicture_small() {
		return picture_small;
	}
	public void setPicture_small(String picture_small) {
		this.picture_small = picture_small;
	}
	public String getPicture_medium() {
		return picture_medium;
	}
	public void setPicture_medium(String picture_medium) {
		this.picture_medium = picture_medium;
	}
	public String getPicture_big() {
		return picture_big;
	}
	public void setPicture_big(String picture_big) {
		this.picture_big = picture_big;
	}
	public String getPicture_xl() {
		return picture_xl;
	}
	public void setPicture_xl(String picture_xl) {
		this.picture_xl = picture_xl;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTracklist() {
		return tracklist;
	}
	public void setTracklist(String tracklist) {
		this.tracklist = tracklist;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	private Integer id;
	@SerializedName("name")
	private String nombre;
	//private String link;
	private String picture;
	private String picture_small;
	private String picture_medium;
	private String picture_big;
	private String picture_xl;
	private String country;
	private String tracklist;
	private String type;
}
