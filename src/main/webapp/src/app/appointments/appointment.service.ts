import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Appointment} from './appointment';

const restUrl = 'http://localhost:8080/api/v1/appointments';

@Injectable({
    providedIn: "root"
})
export class AppointmentService {

    constructor(private http: HttpClient) {
    }

    getAll(): Observable<Appointment[]> {
        return this.http.get<Appointment[]>(restUrl);
    }

    create(appointment: Appointment): Observable<Appointment> {
        return this.http.post<Appointment>(restUrl, appointment);
    }

    delete(id: string): Observable<void> {
        return this.http.delete<void>(`${restUrl}/${id}`);
    }
}
