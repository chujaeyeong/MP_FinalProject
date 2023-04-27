package com.multi.tastezip;

import java.util.Date;

public class CsCommVO {
	private int comm_id;
	private int post_id;
	private String user_id;
	private String content;
	private Date created_date;
	private Date update_date;
	
	public int getComm_id() {
		return comm_id;
	}
	public void setComm_id(int comm_id) {
		this.comm_id = comm_id;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	
	@Override
	public String toString() {
		return "CsCommVO [comm_id=" + comm_id + ", post_id=" + post_id + ", user_id=" + user_id + ", content=" + content
				+ ", created_date=" + created_date + ", update_date=" + update_date + "]";
	}
	
}
