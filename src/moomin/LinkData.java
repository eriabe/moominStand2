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
    
    @Persistent
    private String img; 
    
    public LinkData(String food, String price,String img) {
        super();
        this.food = food;
        this.price = price;
        this.img = img;
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
    public String getImage() {
        return img;
    }
    public void setImage(String price) {
        this.img = img;
    }
}