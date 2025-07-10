package org.cherry.hergy_vanilla.dto;

public class MailRequest {
    private String name;
    private String email;
    private String phoneNumber;
    private String countryName;
    private String companyName;
    private String message;


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getCountryName() { return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
