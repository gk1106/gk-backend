package com.gk.website.portfolio.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gk.website.portfolio.Entity.Contact;

public interface ContactRepositry extends JpaRepository <Contact,Long> {

    

}
