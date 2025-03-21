package ca.sheridancollege.tarkmani.bootstrap;

import ca.sheridancollege.tarkmani.beans.Appointment;
import ca.sheridancollege.tarkmani.repositories.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final AppointmentRepository appointmentRepository;

    @Override
    public void run(String... args) {
        // Create sample appointments
        Appointment appt1 = Appointment.builder()
                .purpose("Dentist Checkup")
                .appointmentDateTime(LocalDate.now().plusDays(2).atTime(14, 30))
                .build();

        Appointment appt2 = Appointment.builder()
                .purpose("Team Meeting")
                .appointmentDateTime(LocalDate.now().plusDays(5).atTime(10, 0))
                .build();

        Appointment appt3 = Appointment.builder()
                .purpose("Client Call")
                .appointmentDateTime(LocalDate.now().plusDays(7).atTime(15, 45))
                .build();

        // Save to database
        appointmentRepository.saveAll(List.of(appt1, appt2, appt3));
    }
}