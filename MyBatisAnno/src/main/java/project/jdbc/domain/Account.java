package project.jdbc.domain;

import java.io.Serializable;

public class Account implements Serializable {
	
	private Long id;
	private Long user_id;
	private int state;
	
	public Account() {
		super();
	}
	public Account(Long id, Long user_id, int state) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.state = state;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
