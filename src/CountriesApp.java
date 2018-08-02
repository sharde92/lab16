import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;
    
    public class CountriesApp {
    
    
        
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            boolean keepGoing = true;
            String userResponse;
            
            while(keepGoing) {
                
            List<Country> list = CountryFileUtil.readFile(); 
            int userInput = Validator.getInt(scnr,"Enter a number: 1 to list countries, 2 to add and 3 to exit file" , 
                    1, 3);  
            
            
            if (userInput == 1){
                for (Country country: list) {
                    System.out.println(country.getName());
                }
            }
            
                else if (userInput == 2) {
                    String name = Validator.getString(scnr, "Enter a country: ");
                    CountryFileUtil.appendLine(new Country(name));
                    
                                        
                }
                else {
                    System.out.println("Goodbye");
                }
            
          //response for do you want to continue
            userResponse = Validator.getStringMatchingRegex(scnr, "Would you like to continue?(y/n)", "y|n|yes|no");
          
            if (userResponse.startsWith("y")) {
            	keepGoing = true;
            }
            else {
            	keepGoing = false;
            }
            
            }
            
        }
    }
