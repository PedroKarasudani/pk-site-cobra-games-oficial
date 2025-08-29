import { Games } from './game.model'

export interface Banner {
    id: number;
    imageUrl: string;
    videoUrl?: string;
    title: string;
    subtitle?: string
    game?: Games;
}