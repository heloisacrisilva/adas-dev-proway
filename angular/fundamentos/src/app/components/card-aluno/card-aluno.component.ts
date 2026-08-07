import { Component, Input, input } from '@angular/core';
import { Aluno } from '../../interfaces/aluno';

@Component({
  selector: 'app-card-aluno',
  imports: [],
  templateUrl: './card-aluno.component.html',
  styleUrl: './card-aluno.component.css',
})
export class CardAlunoComponent {
  @Input({required: true}) aluno!: Aluno 
}
