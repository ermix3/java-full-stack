package ca.sheridancollege.tarkmani.repositories;

import ca.sheridancollege.tarkmani.beans.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}