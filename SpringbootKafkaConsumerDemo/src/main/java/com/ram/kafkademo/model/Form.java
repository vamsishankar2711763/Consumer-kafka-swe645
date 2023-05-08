package com.ram.kafkademo.model;

public class Form {
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String phone;
    private String zipcode;
    private String email;
    private String date;
    private String liked;
    private String interested;
    private String likelihood;

    public Form()
    {

    }

    public Form(int id, String firstname, String lastname,String address,String city,String state,String phone,String zipcode,String email,String date,String liked, String interested,String likelihood)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.zipcode = zipcode;
        this.email = email;
        this.date = date;
        this.liked = liked;
        this.interested = interested;
        this.likelihood = likelihood;

    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void getLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getLiked() {
        return liked;
    }
    public void setLiked(String liked) {
        this.liked = liked;
    }

    public String getInterested() {
        return interested;
    }
    public void setInterested(String interested) {
        this.interested = interested;
    }

    public String getLikelihood() {
        return likelihood;
    }
    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    @Override
    public String toString()
    {
        return "Form [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city + ", state=" + state + ", phone=" + phone + ", email=" + email +", zipcode" + zipcode +", date=" + date + ", liked=" + liked + ", interested=" + interested + ", likelihood=" + likelihood + "]";
    }

}
