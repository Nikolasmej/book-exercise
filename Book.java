/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Nicolas M.)
 * @version (9.22.2018.)
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
    //Ex 2.91
    private int borrowed;
    //Ex 2.92
    private boolean courseText;
    /**
     
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int numberPages,
                boolean bookText)
    {
        author = bookAuthor;
        title = bookTitle;
        // ex 2.85
        pages = numberPages;
        // EX 2.88
        refNumber = "";
        // Ex 2.92
        courseText = bookText;
        
    }
    /** exercise 2.92
     * constructor to set boolean value
     */
    public Book()
    {
     courseText = false;   
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
        //exercise 2.89
        if (refNumber.length()==0)
           System.out.println("- Ref #: ZZZ "); 
        else 
           System.out.println("- Ref #: " + refNumber);  
        //exercise 2.90
        System.out.print("Book has been borrowed: " + borrowed);
    }
    
    /**
     * ex 2.88 method to set ref # of page
     */
    public void setRefNumber(String ref)
    {
        //exercise 2.90
        if (ref.length()>=3)
            refNumber = ref;  
        
        else 
            System.out.println("Error, at least three digits. " );  
    }
    
    /**
     * ex 2.88 method to get ref # of page
     */
    public String getrefNumber()
    {
        return refNumber;  
    }
    
    /**
     * ex 2.91 mutator method to set # times boook is borrowed
     */
    public void setBorrow()
    {
        borrowed =+ 1;  
    }
    /**
     * ex 2.91 mutator method to update # times boook is borrowed
     */
    public int getBorrow()
    {
        return borrowed;  
    }
    /**
     * ex 2.92 acessor method to return boolean
     */
    public boolean isCourseText()
    {
        return courseText;  
    }
}
