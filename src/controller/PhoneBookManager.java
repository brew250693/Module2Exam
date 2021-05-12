package controller;

import model.Phonebook;
import storage.FileManager;
import storage.PhonebookData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManager {
    List<Phonebook> phonebookList = new ArrayList<>();
    PhonebookData phonebookData = FileManager.getINSTANCE();

    public PhoneBookManager() {
    }

    public PhoneBookManager(List<Phonebook> phonebookList) {
        this.phonebookList = phonebookList;
    }

    public List<Phonebook> getPhonebookList() {
        return phonebookList;
    }

    public void setPhonebookList(List<Phonebook> phonebookList) {
        this.phonebookList = phonebookList;
    }

    public void addNewPhonebook(Phonebook p) {
        phonebookList.add(p);
        phonebookData.setData(phonebookList);

    }

    public void showAllPhonebook() {
        for (Phonebook e : phonebookList
        ) {
            System.out.println(e.toString());
        }
    }

    public void searchByName(String name) {
        for (Phonebook e : phonebookList
        ) {
            if (e.getName().equals(name))
                System.out.println(e);
        }
    }

    public void updatePhonebook(String name, String phoneNumber, String address, String email, String faceBook) {
        for (int i = 0; i < phonebookList.size(); i++) {
            if (phonebookList.get(i).getName().equals(name)) {
                phonebookList.get(i).setPhoneNumber(phoneNumber);
                phonebookList.get(i).setAddress(address);
                phonebookList.get(i).setEmail(email);
                phonebookList.get(i).setFaceBook(faceBook);
            }
        }
    }

    public void deletePhonebook(String name) {
        for (int i = 0; i < phonebookList.size(); i++) {
            if (phonebookList.get(i).getName().equals(name)) {
                phonebookList.remove(phonebookList.get(i));
            }
        }
    }
    public void readFile() {
        phonebookData.getData();

    }
    public void writeFile(){
        phonebookData.setData(phonebookList);
    }



}



