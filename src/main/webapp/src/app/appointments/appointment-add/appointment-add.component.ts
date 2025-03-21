import {Component} from '@angular/core';
import {AppointmentService} from '../appointment.service';
import {Appointment} from '../appointment';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-appointment-add',
  imports: [
    FormsModule
  ],
  templateUrl: './appointment-add.component.html',
  styleUrl: './appointment-add.component.css'
})
export class AppointmentAddComponent {
  appointment: Appointment = new Appointment();

  constructor(private appointmentService: AppointmentService) {
  }

  saveAppointment(): void {
    this.appointment.appointmentDateTime = new Date(this.appointment.appointmentDateTime!).toISOString(); // Convert to ISO format

    this.appointmentService.create(this.appointment).subscribe(response => {
      console.log('Appointment Created:', response);
      alert('Appointment added successfully!');
    });
  }
}
