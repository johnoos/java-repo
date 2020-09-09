package com.corejsf;

import java.io.Serializable;

//import javax.inject.Named; // preferred for JEE-compliant appservers
//import javax.faces.bean.ManagedBean;

//import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.SessionScoped;

// The following line specifies the name by which an object of this class 
// is referenced in the JSF pages.
//@ManagedBean(name="user") for servlet runners like Tomcat??

//@Named("user") // best choice for JEE compliant app servers
//@SessionScoped
public class UserBean implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = -7858335225156624734L;
private String name;
   private String password;
   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }
   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }
}