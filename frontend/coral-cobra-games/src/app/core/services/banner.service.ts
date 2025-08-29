import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Banner } from "../../models/banner.model";
import { Observable } from "rxjs";

@Injectable( { providedIn: 'root'})
export class BannerService {

    private apiUrl = 'http://localhost:8080/api/banner';
    constructor(private http: HttpClient) {}

      findAll(): Observable<Banner[]> {
        return this.http.get<Banner[]>(this.apiUrl);
      }
    
      findById(id: number): Observable<Banner> {
        return this.http.get<Banner>(`${this.apiUrl}/${id}`);
      }
    
      create(banner: Banner): Observable<Banner> {
        return this.http.post<Banner>(this.apiUrl, banner);
      }
    
      update(id: number, banner: Banner): Observable<Banner> {
        return this.http.put<Banner>(`${this.apiUrl}/${id}`, banner);
      }
    
      delete(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
      }
}