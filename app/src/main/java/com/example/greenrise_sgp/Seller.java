package com.example.greenrise_sgp;

import android.widget.Spinner;

public class Seller {

    public String name,email,phone,pass,confpass,selltype;

    public Seller() {
    }

    public Seller(String name, String email, String phone, String pass, String confpass, String selltype) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.confpass = confpass;
        this.selltype = selltype;
    }
}
