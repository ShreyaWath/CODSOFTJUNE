import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter 
{

    public static void main(String[] args) 
    {
        String text = getTextFromUser();
        if (text != null) 
        {
            Map<String, Integer> wordCount = countWords(text);
            displayWordCount(wordCount);
        }
    }

    private static String getTextFromUser() 
    {
        System.out.println("Enter 'T' to enter text manually or 'F' to provide a file: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().trim().toUpperCase();

        if (choice.equals("T")) 
        {
            System.out.println("Enter the text: ");
            return scanner.nextLine();
        } else if (choice.equals("F")) 
        {
            System.out.println("Enter the file path: ");
            String filePath = scanner.nextLine().trim();
            try 
            {
                return readFile(filePath);
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("File not found.");
                return null;
            }
        } 
        else 
        {
            System.out.println("Invalid choice.");
            return null;
        }
    }

    private static String readFile(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        StringBuilder content = new StringBuilder();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return content.toString();
    }

    private static Map<String, Integer> countWords(String text) 
    {
        String[] words = text.split("\\s+|\\p{Punct}"); // Split by spaces or punctuation
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) 
        {
            if (!word.isEmpty()) 
            {
                wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
            }
        }
        return wordCount;
    }

    private static void displayWordCount(Map<String, Integer> wordCount) 
    {
        int totalCount = 0;
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) 
        {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
            totalCount += count;
        }
        System.out.println("Total word count: " + totalCount);
    }
}
