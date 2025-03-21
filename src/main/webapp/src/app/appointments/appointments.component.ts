import { Component } from '@angular/core';
import {AppointmentListComponent} from './appointment-list/appointment-list.component';
import {AppointmentAddComponent} from './appointment-add/appointment-add.component';

@Component({
  selector: 'app-appointments',
  imports: [
    AppointmentListComponent,
    AppointmentAddComponent
  ],
  templateUrl: './appointments.component.html',
  styleUrl: './appointments.component.css'
})
export class AppointmentsComponent {

}
