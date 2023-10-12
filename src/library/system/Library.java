/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Library {
    private List<Book> list;
    
    public Library(){
        list=new ArrayList<>();
    }
    
    public boolean addBook(Book book){
        list.add(book);
        return true;
    }
    public List<Book> getAllBooks(){
        return list;
    }
    
    public List<Book> searchByTitle(String title){
        List<Book> result=new ArrayList<>();
        for(Book book:list){
            if(book.getTitle().equalsIgnoreCase(title))
                 result.add(book); 
        }
        return result;
    }
    
    public void checkOutBook(String title){
        for(Book book:list){
            if(book.getTitle().equalsIgnoreCase(title)&&book.isIsAvailable()){
                book.checkOut();
                System.out.println("Book is chechout "+book);
                return ;
            }
        }
        System.out.println("Book not found !");
    }
    
    public void returnBook(String title){
        for(Book book:list){
            if(book.getTitle().equalsIgnoreCase(title)&&book.isIsAvailable()==false){
                book.returnBook();
                System.out.println("Book is returned "+book);
                return ;
            }
        }
        System.out.println("Book not found !");
 
    }
    
    
}
