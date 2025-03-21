package ca.sheridancollege.tarkmani.services;

import ca.sheridancollege.tarkmani.beans.Appointment;
import ca.sheridancollege.tarkmani.repositories.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AppointmentService implements IAppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getOne(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public Appointment create(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment update(Long id, Appointment appointment) {
        var existingAppointment = appointmentRepository.findById(id).orElse(null);
        if (existingAppointment != null) {
            existingAppointment.setAppointmentDateTime(appointment.getAppointmentDateTime());
            existingAppointment.setPurpose(appointment.getPurpose());
            return appointmentRepository.save(existingAppointment);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        var appointment = getOne(id);
        if (appointment != null) {
            appointmentRepository.delete(appointment);
        }
    }
}
