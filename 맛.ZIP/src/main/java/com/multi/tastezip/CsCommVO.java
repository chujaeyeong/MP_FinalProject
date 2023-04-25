package com.multi.tastezip;

import java.util.Date;

public class CsCommVO {
	private int comm_id;
	private int post_id;
	private String user_id;
	private String content;
	private Date create_date;
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
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
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
				+ ", create_date=" + create_date + ", update_date=" + update_date + "]";
	}
	
	
	
}
