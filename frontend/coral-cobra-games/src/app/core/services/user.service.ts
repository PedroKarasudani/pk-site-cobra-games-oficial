import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { User } from "../../models/user.model";
import { Observable } from "rxjs";

@Injectable( { providedIn: 'root'})
export class UserService {

    private apiUrl = 'http://localhost:8080/api/user';
    constructor(private http: HttpClient) {}

      findAll(): Observable<User[]> {
        return this.http.get<User[]>(this.apiUrl);
      }
    
      findById(id: number): Observable<User> {
        return this.http.get<User>(`${this.apiUrl}/${id}`);
      }
    
      create(user: User): Observable<User> {
        return this.http.post<User>(this.apiUrl, user);
      }
    
      update(id: number, user: User): Observable<User> {
        return this.http.put<User>(`${this.apiUrl}/${id}`, user);
      }
    
      delete(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
      }
}