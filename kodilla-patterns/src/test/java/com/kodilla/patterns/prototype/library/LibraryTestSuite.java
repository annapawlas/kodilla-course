package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library= new Library("Fantasy books library");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Fantasy book #" + n, "Author #" + n, LocalDate.of(2000 + n,n,n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Fantasy books library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Fantasy books library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().clear();

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assertions.assertEquals(0, library.getBooks().size());
        Assertions.assertEquals(0, clonedLibrary.getBooks().size());
        Assertions.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
