package com.docsconsole.tutorials.optaional.model;


import com.docsconsole.tutorials.optaional.exception.AddressNotFoundException;

public class Address extends Exception {

    private Integer firstName;
    private String lastName;
    private String streetName;
    private String city;
    private String country;

    public Address getAddressByName(Integer id) throws AddressNotFoundException {
        if (id != null) {
            return new Address();
        }
        throw new AddressNotFoundException();
    }
}