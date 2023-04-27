package com.multi.tastezip;

import java.util.Date;

public class CsPostsVO {
	private int post_id;
	private String user_id;
	private String category;
	private String title;
	private String content;
	private String store;
	private Date created_date;
	private Date update_date;
	private String favorite_food_cg;
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public String getFavorite_food_cg() {
		return favorite_food_cg;
	}
	public void setFavorite_food_cg(String favorite_food_cg) {
		this.favorite_food_cg = favorite_food_cg;
	}
	
	@Override
	public String toString() {
		return "CsPostsVO [post_id=" + post_id + ", user_id=" + user_id + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", store=" + store + ", created_date=" + created_date + ", update_date="
				+ update_date + ", favorite_food_cg=" + favorite_food_cg + "]";
	}
	
	
	
}
