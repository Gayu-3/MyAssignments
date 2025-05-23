package week2.day1;

public class DuplicateWordsHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "We learn Java basics as part of java sessions in java week1";
        String[] words = text.split(" ");
        int count = 0;

        // Nested loop to find duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    words[j] = ""; // Remove duplicate
                    count++;
                }
            }
        }

        // Output the result
        if (count > 0) {
            System.out.print("Modified sentence: ");
            for (String word : words) {
                if (!word.equals("")) {
                    System.out.print(word + " ");
                }
            }
            System.out.println("\nNumber of duplicates removed: " + count);
        } else {
            System.out.println("No duplicates found.");
        }

	}

}
