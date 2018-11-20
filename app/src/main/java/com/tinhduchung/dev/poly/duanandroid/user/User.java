package com.tinhduchung.dev.poly.duanandroid.user;

public class User {

    public static class Info{
        public String name;
        public String phone;
        public String uri;
        public String address;
        public String email;
        public String gender;

        public Info() {
        }

        public Info(String name, String phone, String uri, String address, String email, String gender) {
            this.name = name;
            this.phone = phone;
            this.uri = uri;
            this.address = address;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
    public static class Product{

        public  String nameshop;
        public String nameproduct;
        public String priceproduct;
        public String colorproduct;
        public String lovestatus;
        private String status;
        private String describe;

        public Product() {
        }

        public Product(String nameshop, String nameproduct, String priceproduct, String colorproduct, String lovestatus, String status, String describe) {
            this.nameshop = nameshop;
            this.nameproduct = nameproduct;
            this.priceproduct = priceproduct;
            this.colorproduct = colorproduct;
            this.lovestatus = lovestatus;
            this.status = status;
            this.describe = describe;
        }

        public String getNameshop() {
            return nameshop;
        }

        public void setNameshop(String nameshop) {
            this.nameshop = nameshop;
        }

        public String getNameproduct() {
            return nameproduct;
        }

        public void setNameproduct(String nameproduct) {
            this.nameproduct = nameproduct;
        }

        public String getPriceproduct() {
            return priceproduct;
        }

        public void setPriceproduct(String priceproduct) {
            this.priceproduct = priceproduct;
        }

        public String getColorproduct() {
            return colorproduct;
        }

        public void setColorproduct(String colorproduct) {
            this.colorproduct = colorproduct;
        }

        public String getLovestatus() {
            return lovestatus;
        }

        public void setLovestatus(String lovestatus) {
            this.lovestatus = lovestatus;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }
    }
    public static class Uriimg{
        private String uri;
        public Uriimg() {
        }
        public Uriimg(String uri) {
            this.uri = uri;
        }
        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }
    }
     public static class Id{
        String id;

         public Id() {
         }

         public String getId() {
             return id;
         }

         public void setId(String id) {
             this.id = id;
         }

         public Id(String id) {

             this.id = id;
         }
     }

}
