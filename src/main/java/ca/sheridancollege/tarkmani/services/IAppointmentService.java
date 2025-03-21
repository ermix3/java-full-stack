package ca.sheridancollege.tarkmani.services;

import ca.sheridancollege.tarkmani.beans.Appointment;

import java.util.List;

public interface IAppointmentService {
    List<Appointment> getAll();

    Appointment getOne(Long id);

    Appointment create(Appointment appointment);

    Appointment update(Long id, Appointment appointment);

    void delete(Long id);
}
