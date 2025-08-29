import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Update } from "../../models/update.model";

@Injectable( { providedIn: 'root'})
export class UpdateService {

    private apiUrl = 'http://localhost:8080/api/update';
    constructor(private http: HttpClient) {}

      findAll(): Observable<Update[]> {
        return this.http.get<Update[]>(this.apiUrl);
      }
    
      findById(id: number): Observable<Update> {
        return this.http.get<Update>(`${this.apiUrl}/${id}`);
      }
    
      create(update: Update): Observable<Update> {
        return this.http.post<Update>(this.apiUrl, update);
      }
    
      update(id: number, update: Update): Observable<Update> {
        return this.http.put<Update>(`${this.apiUrl}/${id}`, update);
      }
    
      delete(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
      }
}