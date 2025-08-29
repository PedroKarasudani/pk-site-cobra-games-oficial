import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Games } from '../../models/game.model';

@Injectable({
  providedIn: 'root'
})
export class GameService {
  private apiUrl = 'http://localhost:8080/api/games';

  constructor(private http: HttpClient) {}

  findAll(): Observable<Games[]> {
    return this.http.get<Games[]>(this.apiUrl);
  }

  findById(id: number): Observable<Games> {
    return this.http.get<Games>(`${this.apiUrl}/${id}`);
  }

  create(game: Games): Observable<Games> {
    return this.http.post<Games>(this.apiUrl, game);
  }

  update(id: number, game: Games): Observable<Games> {
    return this.http.put<Games>(`${this.apiUrl}/${id}`, game);
  }

  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
