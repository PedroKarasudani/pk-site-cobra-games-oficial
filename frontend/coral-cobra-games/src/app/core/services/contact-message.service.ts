import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { ContactMessage } from "../../models/contact-message.model";

@Injectable( { providedIn: 'root'})
export class ContactMessageService {

    private apiUrl = 'http://localhost:8080/api/contact';
    constructor(private http: HttpClient) {}

      findAll(): Observable<ContactMessage[]> {
        return this.http.get<ContactMessage[]>(this.apiUrl);
      }
    
      findById(id: number): Observable<ContactMessage> {
        return this.http.get<ContactMessage>(`${this.apiUrl}/${id}`);
      }
    
      create(contactMessage: ContactMessage): Observable<ContactMessage> {
        return this.http.post<ContactMessage>(this.apiUrl, contactMessage);
      }
    
      update(id: number, contactMessage: ContactMessage): Observable<ContactMessage> {
        return this.http.put<ContactMessage>(`${this.apiUrl}/${id}`, contactMessage);
      }
    
      delete(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
      }
}