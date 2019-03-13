package com.example.taskapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author platoiscoding.com
 */
@Controller
public class TaskController {

    /**
     * HOW TO RUN:
     *
     * (1) create a new Schema "taskapp_db" in your mySQL Workbench
     *
     * (2) change password and username und application.properties file
     *
     * (3) run the app & open in broser http://localhost:8000
     *
     * (4) congrats! Your App is Running
     *
     * currently, everytime you restart this app your DB "taskapp_db"
     * will be dropped and reinitialized with the data provided by data.sql
     *
     * if you want to prevent this (application.properties):
     * spring.jpa.hibernate.ddl-auto=update
     * spring.datasource.initialization-mode=never
     *
     * FrontEnd provided by Bootstrap under MIT-License
     * https://startbootstrap.com/themes/sb-admin-2/
     *
     */
    @RequestMapping(value = {"/tasks", "/"}, method = RequestMethod.GET)
    public String dashboard(Model model) {
        return "index";
    }

}