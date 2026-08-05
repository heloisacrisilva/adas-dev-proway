import { Component } from '@angular/core';
import { CardAlunoComponent } from '../../../components/card-aluno/card-aluno.component';

@Component({
  selector: 'app-home',
  imports: [CardAlunoComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  title: string = 'Alunos cadastrados: ';
}
