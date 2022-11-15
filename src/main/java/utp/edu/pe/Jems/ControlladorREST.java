/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.Jems;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author CMB
 */
@RestController
@Slf4j
public class ControlladorREST {
      @GetMapping("/")
      public String main(){
          log.info("Something is happening");
          return "Hi world!!";
      }
}
