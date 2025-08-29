import { TeamMember } from "./team-member.model";

export interface Update {
    id: number;
    title: string;
    fullText: string;
    date: string;
    type: string;
    author: TeamMember
}