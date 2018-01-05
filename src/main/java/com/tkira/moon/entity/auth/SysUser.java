package com.tkira.moon.entity.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tkira.moon.entity.User;

import lombok.Data;

@Data
public class SysUser implements UserDetails {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String userNo;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String telephone;
	
	//0表示正常
	private Integer status;
	
	private List<SysRole> roles = new ArrayList<>();

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> auths = new ArrayList<>();
		for(SysRole role: roles) {
			auths.add(new SimpleGrantedAuthority(role.getName()));
		}
		return auths;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	// custom method, change to a normal user entity
	public User convertToUser() {
		User user = new User();
		user.setId(id);
		return user;
	}
	
}
