package com.prototype.eventtent;
import java.util.UUID;


public class Media extends BaseModel{
	
	private UUID Id;
	private User Creator;
	private String Url;
	private String Thumbnail;
	private String Title;
	private MediaType Type;
	private UserCollection Likes;
	
	public UUID getId() {
		return Id;
	}
	public void setId(UUID id) {
		Id = id;
	}
	public User getCreator() {
		return Creator;
	}
	public void setCreator(User creator) {
		Creator = creator;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getThumbnail() {
		return Thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		Thumbnail = thumbnail;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public MediaType getType() {
		return Type;
	}
	public void setType(MediaType type) {
		Type = type;
	}
	public UserCollection getLikes() {
		return Likes;
	}
	public void setLikes(UserCollection likes) {
		Likes = likes;
	}
	
	

}
