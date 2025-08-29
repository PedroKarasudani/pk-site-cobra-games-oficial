import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, RouterModule} from '@angular/router';
import { GameService } from '../../../core/services/game.service';
import { Games } from '../../../models/game.model';

@Component({
  selector: 'app-game-detail',
  standalone: true,
  imports: [CommonModule, RouterModule],
  template: `
    <div *ngIf="game">
      <h2>{{ game.title }}</h2>
      <p>{{ game.description }}</p>
      <p><b>Plataforma:</b> {{ game.platform }}</p>
      <p><b>Lançamento:</b> {{ game.releaseDate }}</p>
    </div>
  `
})
export class GameDetailComponent implements OnInit {
  game?: Games;

  constructor(private route: ActivatedRoute, private gameService: GameService) {}

  ngOnInit() {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.gameService.findById(id).subscribe(data => this.game = data);
  }
}