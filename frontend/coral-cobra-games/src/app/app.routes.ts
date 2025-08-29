import { Routes } from '@angular/router';
import { GameListComponent } from './features/games/game-list/game-list.component';
import { GameDetailComponent } from './features/games/game-detail/game-detail.component';

export const routes: Routes = [
  { path: '', redirectTo: 'games', pathMatch: 'full' },
  { path: 'games', component: GameListComponent },
  { path: 'games/:id', component: GameDetailComponent }
];
