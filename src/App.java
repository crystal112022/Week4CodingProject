
public class App {

    public static void main(String[] args) {
    	//#1
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int result = ages[ages.length - 1] - ages[0];
        System.out.println(result);
        // this is the array called ages with the code subtracting the value of the 
        //first element in the array from the value in the last 
        //element of the array with my results printed to the console

        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};  
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println(result2);
        // here is my 2nd array with 9 elements with the code
        // subtracting the value of the first element in the array 
        // from the value in the last element in the array with my results printed to the console
        
        
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println(average);
        
        // this is my loop to iterate through the above arrays
        // with the calculated average age printed to the console
    
        //#2
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int totalLetters = 0;
        // here is my array of names with the variable to hold
        // the total number of letters
        
     // here is the loop through the array and calculated the total number of letters
        for (String name : names) {
            totalLetters += name.length();  // here i added the length of each name to totalLetters
        }     
         //#5
        double averageLetters = (double) totalLetters / names.length;
     // here is the calculated average number of letters per name

            System.out.println(averageLetters);
            // average number of letters printed to console 
            
            
          //here is the variable to hold the concatenated names
            String concatenatedNames = "";

            // here is the loop through the array and concatenated names with a space
            for (int i = 0; i < names.length; i++) {
             concatenatedNames += names[i];  // here we added the current name to the result
             if (i < names.length - 1) {
                 concatenatedNames += " ";  // here we added a space after each name, except the last one
             }
            }

            //here is the printed concatenated string
            System.out.println("Concatenated names: " + concatenatedNames);
            
         //#3
            String lastElement = names[names.length - 1];
            System.out.println(lastElement);
         // this is how we access the last element of the array
            
         //#4
            String firstElement = names[0];
            System.out.println(firstElement);
         // this is how we access the first element of the array
            
            
            //#6
            int[] nameLengths = new int[names.length];
            for (int i = 0; i < names.length; i++) {
                nameLengths[i] = names[i].length();
            }
            // this is my new array of int called nameLengths with the loop to iterate
            // over the previously created names array with the added length of each
            // name to the nameLengths array
            
            
            
            int sumOfLengths = 0;  
            for (int length : nameLengths) {
                sumOfLengths += length;  
            }
            // here is the loop to iterate over the nameLengths array and calculate the 
            // sum of all the elements in the array
            
            

           
            System.out.println("Sum of all elements in nameLengths array: " + sumOfLengths);
            
           // here are the results printed to the console
            
            
            // #7 - 
            String result1 = concatenateWord("crystal", 3);
            System.out.println(result1);  // Expected output: "crystalcrystalcrystal"
            
            //#8
            
            String fullName = getFullName("John", "Doe");
            System.out.println(fullName);  // Expected output: "John Doe"
            
            //#9
            int[] numbers2 = {10, 20, 30, 40};
            boolean sumResult = isSumGreaterThan100(numbers2);
            System.out.println(sumResult);  // Expected output: true
    }

        // Method to concatenate a word to itself n times
        public static String concatenateWord(String word, int n) {
            String result = "";  // Empty string to hold the result
            
            // Loop n times, concatenating the word to the result
            for (int i = 0; i < n; i++) {
                result += word;  // Add the word to the result
            }
            
            return result;  // Return the final concatenated string
            

            
        }
                
                   
                
         // #8 - Method to concatenate first name and last name
            public static String getFullName(String firstName, String lastName) {
                return firstName + " " + lastName;  // Concatenate with a space between
            }
                
         // #9 - Method that takes an array of int and returns true if the sum of all ints is greater than 100
            public static boolean isSumGreaterThan100(int[] numbers2) {
                int sum = 0;
                for (int number : numbers2) {
                    sum += number;
                }
                return sum > 100;  // Return true if sum is greater than 100, otherwise false
                
            }
            
            //#10 Method taking an array of double and returns the average of all the elements in the array
            public static double getAverage(double[] numbers) {
                double sum = 0;  // Variable to hold the sum of the elements
                for (double number : numbers) {
                    sum += number;
                }
                return sum / numbers.length;  // Calculate and return the average
            }
            
         // #11 - Method to compare averages of two double arrays
            public static boolean compareAverages(double[] array1, double[] array2) {
                double average1 = getAverage(array1);  // Get average of first array
                double average2 = getAverage(array2);  // Get average of second array
                return average1 > average2;  // Return true if average1 is greater than average2
            
            } 
         // #12 - Method to check if you'll buy a drink, this method is placed at the bottom of the class
            public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
                return isHotOutside && moneyInPocket > 10.50;  // Return true if it's hot and money > 10.50
            }
            
            /**
             * #13 - This method checks if a given string is a palindrome.
             * A palindrome is a word that reads the same backward as forward.
             * 
             * @param word the word to check
             * @return true if the word is a palindrome, false otherwise
             */
            public static boolean isPalindrome(String word) {
                // Convert the word to lowercase to make the check case-insensitive
                word = word.toLowerCase();

                // Initialize pointers for the start and end of the string
                int start = 0;
                int end = word.length() - 1;

                // Compare characters from the start and end, moving toward the center
                while (start < end) {
                    // If characters don't match, it's not a palindrome
                    if (word.charAt(start) != word.charAt(end)) {
                        return false;
                    }
                    // Move the pointers toward the center
                    start++;
                    end--;
                }

                // If all characters match, it is a palindrome
                return true;
            }
        }





	
		
		
