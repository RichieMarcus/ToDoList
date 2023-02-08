package com.ToDoApplication.Repositories;

import com.ToDoApplication.Models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoItemRepository extends JpaRepository <ToDoItem, Long> {
}
