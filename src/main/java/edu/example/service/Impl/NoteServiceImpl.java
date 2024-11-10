package edu.example.service.Impl;

import edu.example.entity.NoteEntity;
import edu.example.model.Note;
import edu.example.repository.NoteRepository;
import edu.example.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    @Autowired
    private  final NoteRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<Note> getAll() {

        List<Note> noteArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->
                noteArrayList.add(modelMapper.map(entity, Note.class)));

        return noteArrayList;
    }

    @Override
    public void addNote(Note note) {
    repository.save(modelMapper.map(note, NoteEntity.class));
    }

    @Override
    public void deleteNote(Integer id) {
    repository.deleteById(id);
    }

    @Override
    public void updateNote(Note note) {
        repository.save(modelMapper.map(note, NoteEntity.class));
    }
}
