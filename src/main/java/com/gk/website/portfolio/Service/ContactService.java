package com.gk.website.portfolio.Service;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.gk.website.portfolio.Entity.Contact;
import com.gk.website.portfolio.Repo.ContactRepositry;

@Service
public class ContactService {
    @Autowired
    private ContactRepositry contactRepo;

    @Autowired
    private JavaMailSender mailSender; 


    public void handleContactForm(Contact contact)
    {
        contactRepo.save(contact);

         SimpleMailMessage message=new SimpleMailMessage();

         message.setTo("gk753778@gmail.com");
        message.setSubject("You have new Request From Your Website !!");
        message.setText(" Name :"+contact.getName()+
                        "\nEmail :"+contact.getEmail()+
                        "\nMessage :"+contact.getMessage());
             mailSender.send(message);
                        

    }

}
