/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Damar Scott
 * @version 02/03/2025
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     * Set the number of pages as well.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourse)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourse;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    public void printPages()
    {
        System.out.println("Number of Pages: " + pages);
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length()>=3)
        {
            refNumber = ref;
        } else {
            System.out.println("Error: Reference Number is not 3 or more characters long.");
        }
    }
    
    public void borrow()
    {
        borrowed += 1;
    }
    
    //Reads out all the details of the book in a neat order
    public void printDetails()
    {
        System.out.print("Title: " + title + ", Author: " + author + 
        ", Pages: " + pages + ", \nReference Number: ");
        if(refNumber.length()==0)
        {
            System.out.print("ZZZ");
        } else {
            System.out.print(refNumber);
        }
        System.out.println(", Borrowed " + borrowed + " times.");
        if(courseText==true)
        {
            System.out.println("This is a textbook on a course.");
        } else {
            System.out.println("This is not a textbook on a course.");
        }
    }
}
