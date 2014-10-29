package com.prototype.eventtent;
import java.util.Date;
import java.util.List;


public class Event extends BaseModel{

	private Location Loc;
	private Date Starting;
	private Date Ending;
	private User Host;
	private User Collaborator;
	private UserCollection Attendees;
	private UserCollection Rsvp;
	private String Title;
	private MediaAlbum Album;
	private List<String> Category;
	private List<String> Keywords;
	
	public Location getLoc() {
		return Loc;
	}
	public void setLoc(Location loc) {
		Loc = loc;
	}
	public Date getStarting() {
		return Starting;
	}
	public void setStarting(Date starting) {
		Starting = starting;
	}
	public Date getEnding() {
		return Ending;
	}
	public void setEnding(Date ending) {
		Ending = ending;
	}
	public User getHost() {
		return Host;
	}
	public void setHost(User host) {
		Host = host;
	}
	public User getCollaborator() {
		return Collaborator;
	}
	public void setCollaborator(User collaborator) {
		Collaborator = collaborator;
	}
	public UserCollection getAttendees() {
		return Attendees;
	}
	public void setAttendees(UserCollection attendees) {
		Attendees = attendees;
	}
	public UserCollection getRsvp() {
		return Rsvp;
	}
	public void setRsvp(UserCollection rsvp) {
		Rsvp = rsvp;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public MediaAlbum getAlbum() {
		return Album;
	}
	public void setAlbum(MediaAlbum album) {
		Album = album;
	}
	public List<String> getCategory() {
		return Category;
	}
	public void setCategory(List<String> category) {
		Category = category;
	}
	public List<String> getKeywords() {
		return Keywords;
	}
	public void setKeywords(List<String> keywords) {
		Keywords = keywords;
	}
	
	
	
}
