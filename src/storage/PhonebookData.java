package storage;

import model.Phonebook;

import java.io.IOException;
import java.util.List;

public interface PhonebookData {
    List<Phonebook> getData() ;
    void setData(List<Phonebook> phonebookList);

}
