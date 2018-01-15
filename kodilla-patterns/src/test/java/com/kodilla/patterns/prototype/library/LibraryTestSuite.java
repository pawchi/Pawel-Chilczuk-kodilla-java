package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;


public class LibraryTestSuite {
    @Test
    public void testToString(){
        //Given

        Book book1 = new Book("Solaris","Stanislaw Lem", LocalDate.of(2017,10,15));
        Book book2 = new Book("Combo","John Smith", LocalDate.of(2012,10,15));
        Book book3 = new Book("ABC","Jerzy Ogórek", LocalDate.of(2011,10,15));

        Library library = new Library("Library oryginal");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library - cloned - shallowCopy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            clonedLibrary.setName("Library - cloned - deepCopy");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println("Oryginal library size :"+library.getBooks().size());
        System.out.println("Cloned library size :"+clonedLibrary.getBooks().size());
        System.out.println("Deep cloned library size :"+deepClonedLibrary.getBooks().size());
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());

    }
}
