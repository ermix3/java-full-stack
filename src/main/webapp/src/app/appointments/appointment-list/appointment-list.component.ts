import {Component, OnInit} from '@angular/core';
import {AppointmentService} from '../appointment.service';
import {Appointment} from '../appointment';
import {NgForOf} from '@angular/common';

@Component({
    selector: 'app-appointment-list',
    imports: [
        NgForOf
    ],
    templateUrl: './appointment-list.component.html',
    styleUrl: './appointment-list.component.css'
})
export class AppointmentListComponent implements OnInit {
    appointments: Appointment[] = [];

    constructor(private appointmentService: AppointmentService) {
    }

    ngOnInit(): void {
        this.loadAppointments();
    }

    loadAppointments(): void {
        this.appointmentService.getAll().subscribe(data => {
            this.appointments = data;
        });
    }

    deleteAppointment(id: string): void {
        if (confirm('Are you sure you want to delete this appointment?')) {
            this.appointmentService.delete(id).subscribe(() => {
                this.appointments = this.appointments.filter(appointment => appointment.id !== id);
            });
        }
    }
}
