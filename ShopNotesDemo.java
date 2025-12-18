import java.util.Scanner; // statement to create a scanner
import java.util.ArrayList; // statement to create an array list
import java.io.*; // statement to import all the io files.



public class ShopNotesDemo { 

	public static void main(String[] args) throws IOException {
	// variables
	Scanner scan = new Scanner(System.in); // stored inside the IDE system, mainly for yes or no.
	ArrayList <String> myShoppingList = new ArrayList <String>(); // an Array of Strings called myShopingList. Current status: empty.
	PrintWriter outputFile = new PrintWriter("CustomerData.txt"); // file that stores the Customer's list as a txt file.
	
	String myUserInput; // will store the input of the user. thus yes and no.
	String myUserInput2; // stores the values inside the array's list.
	String confirmation = "yes";
	String negation = "no";
	boolean listCreation;
	

	// Welcome statement
	System.out.println("Hello, welcome to the Shopnotes app Demo, as said in the title this is a demo. The goal behind this app is to create a shopping list and save it into a file for easy groceries shopping.");
	
	// Key statement that will prompt the user if they want to create a shopping list.
    System.out.println("Do you want to create a Shopping list ? Enter yes or no");
    // while loop and if statements.
    myUserInput = scan.next();
    if(myUserInput.equalsIgnoreCase(confirmation)) {
    	listCreation = true;
    	
    	// While loop because it's based on user input.
    while(listCreation) { // might change the condition
    	System.out.println("Please enter an item to the list.");
    	myUserInput2 = scan.next();
    	myShoppingList.add(myUserInput2);
    System.out.println("Is that all ?"); // Can break out of the loop.
        myUserInput = scan.next();
        
      // if statements to determine whether to get out of the loop after "Is that all ?"
      if (myUserInput.equalsIgnoreCase(confirmation)) { // if yes then stop
    	  // set boolean to false to get out of the loop.
    	  listCreation = false;
      }
      else if (myUserInput.equalsIgnoreCase(negation)) { // if no then loop again
    	 // set listCreation to true
    	  listCreation = true;
      }   
        
      else { // if the user inputs something else than the user's input is invalid
    	  System.out.println("Invalid response");
    	  // set listCreation to false.
    	  listCreation = false;
      }
    }
    // for loop to display the Shopping List.
    outputFile.println("Here's your shopping list: ");
    for(int i = 0; i < myShoppingList.size(); i++) {
      	outputFile.println("Item " + (i+1) + ": " + myShoppingList.get(i));
        }
   }
    else if(myUserInput.equalsIgnoreCase(negation)) {
        listCreation = false;
        System.out.println("Well there's nothing else you can do...");
    }
    else {
    	System.out.println("Invalid response");
    }
    
   
    outputFile.close(); // close file to avoid leaks.
     } 
    
	}



