package moomin;

import java.net.URL;
import java.util.Date;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkDataLogin {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
     
    @Persistent
    private String userId;
     
    @Persistent
    private String pass;
     
  
    public LinkDataLogin(String userId, String pass) {
        super();
        this.userId = userId;
        this.pass = pass;
    }
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
 
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    } 

}
