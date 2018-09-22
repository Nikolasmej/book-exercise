/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    //Ex 2.85
    private int pages;
    // EX 2.88
    private String refNumber;
    /**
     
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int numberPages)
    {
        author = bookAuthor;
        title = bookTitle;
        // ex 2.85
        pages = numberPages;
        // EX 2.88
        refNumber = "";
        
    }

    // Add the methods here ...
    /** exercise 2.83
     * Accessor method to return author field
     */
    public String getAuthor()
    {
     return author;   
    }
    
    /**
     * Accessor method to return title field
     */
    public String getTitle()
    {
     return title;   
    }
    
    /** exercise 2.84
     *  method to print author 
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    /** exercise 2.84
     *  method to print title 
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    
    /**
     * ex 2.85 method to return # of pages
     */
    public int getPages()
    {
     return pages;   
    }
    
    /** exercise 2.87
     *  method to print details of the book 
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    
    /**
     * ex 2.88 method to set ref # of page
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;  
    }
    
    /**
     * ex 2.88 method to get ref # of page
     */
    public String getrefNumber()
    {
        return refNumber;  
    }
    
    
}
