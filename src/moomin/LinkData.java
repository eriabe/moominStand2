package moomin;

//import java.net.URL;
//import java.util.Date;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
     
    @Persistent
    private String food;
     
    @Persistent
    private String price;
     
  
    public LinkData(String food, String price) {
        super();
        this.food = food;
        this.price = price;
    }
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
 
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    } 
   
}