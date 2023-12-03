package ifsuldeminas.bcc.PrimeiroProjeto.Model.Controller;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Filial;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Services.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filiais")
public class FilialController {

    @Autowired
    private FilialService filialService;

    @GetMapping
    public ResponseEntity<List<Filial>> getAllFiliais() {
        List<Filial> filiais = filialService.getAllFiliais();
        return new ResponseEntity<>(filiais, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filial> getFilialById(@PathVariable Long id) {
        try {
            Filial filial = filialService.getFilialById(id);
            return new ResponseEntity<>(filial, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Filial> createFilial(@RequestBody Filial filial) {
        try {
            Filial createdFilial = filialService.createFilial(filial);
            return new ResponseEntity<>(createdFilial, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filial> updateFilial(@PathVariable Long id, @RequestBody Filial filial) {
        try {
            Filial updatedFilial = filialService.updateFilial(id, filial);
            return new ResponseEntity<>(updatedFilial, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilial(@PathVariable Long id) {
        try {
            filialService.deleteFilial(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
