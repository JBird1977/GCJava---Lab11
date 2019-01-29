
public class Movie {
    
    private String title;
    private String category;
    
    
    public Movie() {}
    
    public Movie (String name, String cat) {
        
       this.title = name;
       this.category =cat;
       
    }
    
    public void setTitle(String name) {       
        this.title = name;
       
       
        
    }

    public void setCategory(String cat) {
        this.category = cat; 
    }
    
    public void movieSet(String name, String cat) {
        this.title = name;
        this.category = cat;
    }
    
    public String movieGetCat() {
        return this.category;
    }
    
    public String movieGetTitle() {
        return this.title;
    }
    
    @Override
    public String toString() {
   //     return "Student(name= " + name + ", favNumber= " + favNumber + ")";
    return "Movie: " + title + " Category: " + category;
    }
    
    
}
