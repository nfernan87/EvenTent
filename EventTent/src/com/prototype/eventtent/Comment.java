package com.prototype.eventtent;
import java.util.Date;


public class Comment {
	
	private String Text;
	private Date Created;
	private User CreatedBy;


	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}
	public Date getCreated() {
		return Created;
	}

	public void setCreated(Date created) {
		Created = created;
	}
	
	public User getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(User createdBy) {
		CreatedBy = createdBy;
	}
}
