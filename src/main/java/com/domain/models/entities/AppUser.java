package com.domain.models.entities;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "tbl_users")
public class AppUser implements UserDetails{

  @Id //supaya primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)//supaya auto increment
  private Long id;
  @Column(length = 150, nullable = false)
  private String fullName;
  @Column(length = 150, nullable = false, unique = true)
  private String email;
  @Column(length = 200, nullable = false)
  private String password;
  @Enumerated((EnumType.STRING))
  private AppUserRole appUserRole;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    // TODO Auto-generated method stub
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority(appUserRole.name());
    return Collections.singletonList(authority);
  }

  @Override
  public String getPassword() {
    // TODO Auto-generated method stub
    return password;
  }

  @Override
  public String getUsername() {
    // TODO Auto-generated method stub
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public boolean isEnabled() {
    // TODO Auto-generated method stub
    return true;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AppUserRole getAppUserRole() {
    return appUserRole;
  }

  public void setAppUserRole(AppUserRole appUserRole) {
    this.appUserRole = appUserRole;
  }
  
  
}
