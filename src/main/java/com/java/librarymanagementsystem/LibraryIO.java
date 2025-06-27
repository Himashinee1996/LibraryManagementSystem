package com.java.librarymanagementsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryIO {
    public static void saveItemToFile(List<LibraryItems> libraryItems, String fileName){
        try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(libraryItems);
            System.out.println("Library Items save to " + fileName +" successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static List<LibraryItems> loadItemsFromFile(String fileName){
        File file = new File(fileName);
        if (!file.exists()){
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (List<LibraryItems>) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public static void saveUserToFile(List<User> users, String fileName){
        try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(users);
            System.out.println("Users save to " + fileName +" successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static List<User> loadUsersFromFile(String fileName){
        File file = new File(fileName);
        if (!file.exists()){
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (List<User>) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public static void saveBorrowedItems(Map<String , String> borrowedItems, String fileName){
        try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(borrowedItems);
            System.out.println("Borrowed Items save to " + fileName +" successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String , String> loadBorrowedItems(String fileName){
        File file = new File(fileName);
        if (!file.exists()){
            return new HashMap<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (Map<String, String>) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}

