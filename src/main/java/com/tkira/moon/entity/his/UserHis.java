package com.tkira.moon.entity.his;

import com.tkira.moon.entity.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class UserHis extends User {

	private User linkUser;
	
	public UserHis(User user) {
		super(user);
		this.linkUser = user;
	}
}
