package TEST;

import java.awt.print.Book;

class Books
{
    public String title;
    public String author;
}
class BooksTestDrive extends  Books
{
    public static void main(String ags[])
    {
        Books [] myBooks = new Books [3];
        Books b = new Books();
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author= "sue";
        myBooks [2].author = "ian";
        while (x <=3)
        {
            System.out.print(myBooks [x].title); System.out.print("by");
            System.out.println(myBooks [x].author) ;
            x = x + 1;
        }
    }
}