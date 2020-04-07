package be.ucll.r0654233.todo.repository;

import be.ucll.r0654233.todo.domain.MainTask;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<MainTask, Integer> {


}
