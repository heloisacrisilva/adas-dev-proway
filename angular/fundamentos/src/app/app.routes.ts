import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { CardAlunoComponent } from './components/card-aluno/card-aluno.component';

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'alunos', component: CardAlunoComponent }, //criar o componente AlunoLista
    { path: '**', redirectTo: '' }
];
