package me.he.restapiwithspring;

import me.he.restapiwithspring.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}