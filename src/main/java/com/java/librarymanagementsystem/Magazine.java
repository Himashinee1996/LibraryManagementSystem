package com.java.librarymanagementsystem;

public class Magazine extends LibraryItems{
    public Magazine(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowItem(User user) {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(user+"Borrowed the Magazine" + getTitle());
        }else {
            System.out.println("The Magazine" + getTitle() + "is already borrowed");
        }

    }
}
