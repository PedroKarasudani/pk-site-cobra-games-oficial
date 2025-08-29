import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { TeamMember } from "../../models/team-member.model";

@Injectable( { providedIn: 'root'})
export class TeamMemberService {

    private apiUrl = 'http://localhost:8080/api/team_member';
    constructor(private http: HttpClient) {}

      findAll(): Observable<TeamMember[]> {
        return this.http.get<TeamMember[]>(this.apiUrl);
      }
    
      findById(id: number): Observable<TeamMember> {
        return this.http.get<TeamMember>(`${this.apiUrl}/${id}`);
      }
    
      create(teamMember: TeamMember): Observable<TeamMember> {
        return this.http.post<TeamMember>(this.apiUrl, teamMember);
      }
    
      update(id: number, teamMember: TeamMember): Observable<TeamMember> {
        return this.http.put<TeamMember>(`${this.apiUrl}/${id}`, teamMember);
      }
    
      delete(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
      }
}