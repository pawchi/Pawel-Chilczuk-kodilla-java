package com.kodilla.testing.library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());

    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testlistBooksInHandsOfUserNoBooks() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> emptyListOfUserBooks = new ArrayList<Book>();
        LibraryUser user1 = new LibraryUser("Jan","Kowalski","1515");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(emptyListOfUserBooks);

        //When
        List<Book> listUserBooksEmpty = bookLibrary.listBooksInHandsOf(user1);
        //Than
        assertEquals(0,listUserBooksEmpty.size());

    }

    @Test
    public void testlistBooksInHandsOfUserOneBook() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfUserBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        listOfUserBooks.add(book1);

        LibraryUser user1 = new LibraryUser("Jan","Kowalski","1515");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listOfUserBooks);

        //When
        List<Book> listUserHasOneBook = bookLibrary.listBooksInHandsOf(user1);

        //Than
        assertEquals(1, listUserHasOneBook.size());

    }

    @Test
    public void testlistBooksInHandsOfUserFiveBooks() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfUserBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo1", "John Smith", 2006);
        Book book2 = new Book("Secrets of Alamo2", "John Smith", 2007);
        Book book3 = new Book("Secrets of Alamo3", "John Smith", 2008);
        Book book4 = new Book("Secrets of Alamo4", "John Smith", 2008);
        Book book5 = new Book("Secrets of Alamo5", "John Smith", 2008);
        listOfUserBooks.add(book1);
        listOfUserBooks.add(book2);
        listOfUserBooks.add(book3);
        listOfUserBooks.add(book4);
        listOfUserBooks.add(book5);

        LibraryUser user1 = new LibraryUser("Jan","Kowalski","1515");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listOfUserBooks);
        //When
        List<Book> listUserHasFiveBooks = bookLibrary.listBooksInHandsOf(user1);
        //Than
        assertEquals(5,listUserHasFiveBooks.size());
    }
}
