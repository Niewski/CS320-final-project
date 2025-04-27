package com.cs320.project1;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
        contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        service.addContact(contact);
    }

    @Test
    public void testAddDuplicateContactThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(new Contact("contact1", "Jane", "Doe", "9876543210", "456 What Ave"));
        });
    }

    @Test
    public void testDeleteContact() {
        service.deleteContact("contact1");
        assertThrows(NoSuchElementException.class, () -> service.deleteContact("contact1"));
    }

    @Test
    public void testDeleteNonexistentContactThrowsException() {
        assertThrows(NoSuchElementException.class, () -> service.deleteContact("unknown"));
    }

    @Test
    public void testRetrieveExistingContact() {
        Contact retrieved = service.getContact("contact1");
        assertNotNull(retrieved);
        assertEquals("contact1", retrieved.getContactId());
        assertEquals("John", retrieved.getFirstName());
        assertEquals("Doe", retrieved.getLastName());
        assertEquals("0123456789", retrieved.getPhone());
        assertEquals("123 What Street", retrieved.getAddress());
    }

    @Test
    public void testRetrieveNonexistentContactThrowsException() {
        assertThrows(NoSuchElementException.class, () -> service.getContact("unknown"));
    }
}

