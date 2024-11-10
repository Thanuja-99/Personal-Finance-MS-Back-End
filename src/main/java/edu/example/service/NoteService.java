package edu.example.service;

import edu.example.model.Note;

import java.util.List;

public interface NoteService {
    List<Note>getAll();
    void addNote(Note note);
    void deleteNote(Integer id);
    void updateNote(Note note);
}
