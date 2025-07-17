package com.xGo.coders.xGo_to_do_list.repository;

import com.xGo.coders.xGo_to_do_list.model.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {
}
