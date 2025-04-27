package com.cs320.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testValidContactId() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertEquals("contact1", contact.getContactId());
    }

    @Test
    public void testValidFirstName() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertEquals("John", contact.getFirstName());
    }

    @Test
    public void testValidLastName() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertEquals("Doe", contact.getLastName());
    }

    @Test
    public void testValidPhone() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertEquals("0123456789", contact.getPhone());
    }

    @Test
    public void testValidAddress() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertEquals("123 What Street", contact.getAddress());
    }

    @Test
    public void testNullContactIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "John", "Doe", "0123456789", "123 What Street"));
    }

    @Test
    public void testTooLongContactIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "0123456789", "123 What Street"));
    }

    @Test
    public void testNullFirstNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", null, "Doe", "0123456789", "123 What Street"));
    }

    @Test
    public void testTooLongFirstNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", "ThisNameIsTooLong", "Doe", "0123456789", "123 What Street"));
    }

    @Test
    public void testNullLastNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", "John", null, "0123456789", "123 What Street"));
    }

    @Test
    public void testTooLongLastNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", "John", "ThisLastNameIsTooLong", "0123456789", "123 What Street"));
    }

    @Test
    public void testNullPhoneThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", "John", "Doe", null, "123 What Street"));
    }

    @Test
    public void testInvalidPhoneLengthThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", "John", "Doe", "1234", "123 What Street"));
    }

    @Test
    public void testNullAddressThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", "John", "Doe", "0123456789", null));
    }

    @Test
    public void testTooLongAddressThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("contact1", "John", "Doe", "0123456789", "1234567890123456789012345678901"));
    }

    @Test
    public void testSetValidFirstName() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());
    }

    @Test
    public void testSetValidLastName() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());
    }

    @Test
    public void testSetValidPhone() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        contact.setPhone("9876543210");
        assertEquals("9876543210", contact.getPhone());
    }

    @Test
    public void testSetValidAddress() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        contact.setAddress("456 What Ave");
        assertEquals("456 What Ave", contact.getAddress());
    }

    @Test
    public void testSetInvalidFirstNameNullThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
    }

    @Test
    public void testSetInvalidFirstNameTooLongThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("TooLongFirstName"));
    }

    @Test
    public void testSetInvalidLastNameNullThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
    }

    @Test
    public void testSetInvalidLastNameTooLongThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName("TooLongLastName"));
    }

    @Test
    public void testSetInvalidPhoneNullThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
    }

    @Test
    public void testSetInvalidPhoneTooShortThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("123456789"));
    }

    @Test
    public void testSetInvalidAddressNullThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
    }

    @Test
    public void testSetInvalidAddressTooLongThrowsException() {
        Contact contact = new Contact("contact1", "John", "Doe", "0123456789", "123 What Street");
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress("This address is definitely more than thirty characters long"));
    }
}

