/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp.mii.bootcamp.mii.controllers;

import bootcamp.mii.bootcamp.mii.services.FilmActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Okala
 */
@Controller
public class MainController {
    
    @Autowired
    private FilmActorService filmActorService;
    
    @GetMapping("/")
    public String index(Model model){
        String idnya = "2";
        model.addAttribute("dataActor", filmActorService.findAllActor());
        return "index";
    }
}
