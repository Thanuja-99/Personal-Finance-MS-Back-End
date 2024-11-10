package edu.example.controller;

import edu.example.model.Note;
import edu.example.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
@RequiredArgsConstructor
@CrossOrigin
public class NoteController {

    @Autowired
    final NoteService service;

    @GetMapping("/get-note")
    public List<Note> getNote(){
        return  service.getAll();
    }

    @PostMapping("/add-note")
    public void addNote(@RequestBody Note note){
        service.addNote(note);
    }

    @DeleteMapping("/delete-note/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteNote(@PathVariable Integer id){
        service.deleteNote(id);
    }

    @PutMapping("/update-note")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateNote( @RequestBody Note note){
        service.updateNote(note);
    }

}
