/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.system;

/**
 *
 * @author ADMIN
 */
public class Book {

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", auther=" + auther + ", isAvailable=" + isAvailable + '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public Book(String title, String auther, boolean isAvailable) {
        this.title = title;
        this.auther = auther;
        this.isAvailable = isAvailable;
    }

    public Book() {
    }
    private String title;
    private String auther;
    private boolean isAvailable;
    
    
    public boolean isAvailable(){
        return this.isAvailable;
    }
    
    public void checkOut(){
        this.isAvailable=false;
    }
    public void returnBook(){
        this.isAvailable=true;
    }
}
