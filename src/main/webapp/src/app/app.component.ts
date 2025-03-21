import {Component} from '@angular/core';
import {AppointmentsComponent} from './appointments/appointments.component';

@Component({
    selector: 'app-root',
    imports: [AppointmentsComponent],
    templateUrl: './app.component.html',
    styleUrl: './app.component.css'
})
export class AppComponent {
    title = 'webapp';
}
