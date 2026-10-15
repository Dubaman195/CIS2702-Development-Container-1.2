package edu.oop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    // Step 1: Ensure exactly three fields exist (prevents over-engineering or missing requirements)
    @Test
    void testClassHasExactlyThreeFields() {
        Field[] fields = Book.class.getDeclaredFields();
        
        // Filter out potential synthetic fields injected by compilers/coverage tools (like Jacoco)
        int actualFieldCount = 0;
        for (Field field : fields) {
            if (!field.isSynthetic()) {
                actualFieldCount++;
            }
        }
        
        assertEquals(3, actualFieldCount, 
            "The Book class should declare exactly 3 instance variables (title, author, pages).");
    }

    // Step 2: Enforce Encapsulation (fields must be private) and ensure they are instance variables (not static)
    @Test
    void testFieldsArePrivateAndNotStatic() {
        Field[] fields = Book.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isSynthetic()) continue; // Ignore compiler-injected fields
            
            int modifiers = field.getModifiers();
            
            assertTrue(Modifier.isPrivate(modifiers), 
                "Encapsulation failure: Field '" + field.getName() + "' must be private.");
            
            assertFalse(Modifier.isStatic(modifiers), 
                "Instance failure: Field '" + field.getName() + "' must not be static.");
        }
    }

    // Step 3: Verify the data types of the declared fields match the requirements
    @Test
    void testFieldTypesMatchRequirements() {
        Field[] fields = Book.class.getDeclaredFields();
        
        int stringCount = 0;
        int intCount = 0;

        for (Field field : fields) {
            if (field.isSynthetic()) continue;

            if (field.getType() == String.class) {
                stringCount++;
            } else if (field.getType() == int.class) {
                intCount++;
            }
        }

        assertEquals(2, stringCount, 
            "The Book class must have exactly two String fields (for title and author).");
        assertEquals(1, intCount, 
            "The Book class must have exactly one int field (for pages).");
    }

    // Step 4: Prove the constructor accepts the arguments and getTitle works
    @Test
    void testConstructorAndGetTitle() {
        Book book = new Book("Java Programming Essentials", "Dan Campbell", 432);
        assertEquals("Java Programming Essentials", book.getTitle(), 
            "getTitle() should return the title passed to the constructor.");
    }

    // Step 5: Prove getAuthor works
    @Test
    void testConstructorAndGetAuthor() {
        Book book = new Book("Java Programming Essentials", "Dan Campbell", 432);
        assertEquals("Dan Campbell", book.getAuthor(), 
            "getAuthor() should return the author passed to the constructor.");
    }

    // Step 6: Prove getPages works
    @Test
    void testConstructorAndGetPages() {
        Book book = new Book("Java Programming Essentials", "Dan Campbell", 432);
        assertEquals(432, book.getPages(), 
            "getPages() should return the integer passed to the constructor.");
    }

    // Step 7: Ensure fields are instance variables in practice, retaining unique data
    @Test
    void testMultipleBookInstancesRetainUniqueData() {
        Book book1 = new Book("Book One", "Author A", 100);
        Book book2 = new Book("Book Two", "Author B", 200);

        assertEquals("Book One", book1.getTitle(), "Data mismatch: check that you are not using 'static' variables.");
        assertEquals("Book Two", book2.getTitle(), "Data mismatch: check that you are not using 'static' variables.");
    }

    // Step 8: Test the displayDetails method for required formatting
    @Test
    void testDisplayDetailsOutputsExactLabelsAndData() {
        Book book = new Book("Java Programming Essentials", "Dan Campbell", 432);
        book.displayDetails();
        
        String output = outContent.toString();
        
        assertTrue(output.contains("Title: Java Programming Essentials"), 
            "Output must contain 'Title: Java Programming Essentials'");
        assertTrue(output.contains("Author: Dan Campbell"), 
            "Output must contain 'Author: Dan Campbell'");
        assertTrue(output.contains("Pages: 432"), 
            "Output must contain 'Pages: 432'");
    }

    // Step 9: Test displayDetails with different data to prevent hardcoded print statements
    @Test
    void testDisplayDetailsDoesNotHardcodeOutput() {
        Book book = new Book("Effective Java", "Joshua Bloch", 412);
        book.displayDetails();
        
        String output = outContent.toString();
        
        assertTrue(output.contains("Title: Effective Java"), 
            "displayDetails() must use the object's instance variables, not hardcoded text.");
        assertTrue(output.contains("Author: Joshua Bloch"), 
            "displayDetails() must use the object's instance variables, not hardcoded text.");
        assertTrue(output.contains("Pages: 412"), 
            "displayDetails() must use the object's instance variables, not hardcoded text.");
    }
}


    // @Test
    // void testConstructorSetsFields() {
    //     Book book = new Book("1984", "George Orwell", 328);
    //     assertEquals("1984", book.getTitle());
    //     assertEquals("George Orwell", book.getAuthor());
    //     assertEquals(328, book.getPages());
    // }

    // @Test
    // void testDisplayDetailsOutputsCorrectText() {
    //     Book book = new Book("Pride and Prejudice", "Jane Austen", 432);
    //     ByteArrayOutputStream out = new ByteArrayOutputStream();
    //     System.setOut(new PrintStream(out));

    //     book.displayDetails();

    //     String output = out.toString();
    //     assertTrue(output.contains("Title: Pride and Prejudice"));
    //     assertTrue(output.contains("Author: Jane Austen"));
    //     assertTrue(output.contains("Pages: 432"));
    // }

