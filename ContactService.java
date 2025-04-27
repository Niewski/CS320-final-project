package com.cs320.project1;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new NoSuchElementException("Contact ID not found");
        }
        contacts.remove(contactId);
    }

    public Contact getContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new NoSuchElementException("Contact ID not found");
        }
        return contacts.get(contactId);
    }
}

