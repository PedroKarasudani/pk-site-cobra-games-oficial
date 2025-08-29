import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { GameService } from '../../../core/services/game.service';
import { Games } from '../../../models/game.model';

@Component({
  selector: 'app-game-list',
  standalone: true,
  imports: [CommonModule, RouterModule],
  template: `
    <h2>Lista de Jogos</h2>
    <ul>
      <li *ngFor="let game of games">
        <a [routerLink]="['/games', game.id]">{{ game.title }}</a>
      </li>
    </ul>
  `
})
export class GameListComponent implements OnInit {
  games: Games[] = [];

  constructor(private gameService: GameService) {}

  ngOnInit() {
    this.gameService.findAll().subscribe(data => this.games = data);
  }
}
