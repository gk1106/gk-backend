package com.gk.website.portfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.website.portfolio.Entity.Contact;
import com.gk.website.portfolio.Service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") //frontend website//https://gk-wheat.vercel.app
public class ContactController {

    @Autowired
    private ContactService contactService;


    @PostMapping
    public ResponseEntity<String> submitForm(@RequestBody Contact contact) {
        contactService.handleContactForm(contact);




        return ResponseEntity.ok("Mesaage received..!");
    }
    

}
