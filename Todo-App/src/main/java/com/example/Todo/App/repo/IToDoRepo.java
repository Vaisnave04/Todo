package com.example.Todo.App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Todo.App.model.ToDo;
@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
