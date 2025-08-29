import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { CompanyInfo } from "../../models/company-info.model";

@Injectable( { providedIn: 'root'})
export class CompanyInfoService {

    private apiUrl = 'http://localhost:8080/api/companyinfo';
    constructor(private http: HttpClient) {}

      findAll(): Observable<CompanyInfo[]> {
        return this.http.get<CompanyInfo[]>(this.apiUrl);
      }
    
      findById(id: number): Observable<CompanyInfo> {
        return this.http.get<CompanyInfo>(`${this.apiUrl}/${id}`);
      }
    
      create(companyInfo: CompanyInfo): Observable<CompanyInfo> {
        return this.http.post<CompanyInfo>(this.apiUrl, companyInfo);
      }
    
      update(id: number, companyInfo: CompanyInfo): Observable<CompanyInfo> {
        return this.http.put<CompanyInfo>(`${this.apiUrl}/${id}`, companyInfo);
      }
    
      delete(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
      }

}