
public class Country {
    // These are private. They cannot even be accessed by the child classes.
        private String name;
        
        
        public Country(String name) {
            this.name = name;
            
        }
        
        public Country() {}
        
        public String getName() {
            return name;
        }
        public String setName(String name) {
            return this.name = name;
    }
}