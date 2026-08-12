import { Component, Input, input } from '@angular/core';
import { Aluno } from '../../interfaces/aluno';
import { NgClass } from "../../../../node_modules/@angular/common"; 

@Component({
  selector: 'app-card-aluno',
  templateUrl: './card-aluno.component.html',
  styleUrl: './card-aluno.component.css',
  imports: [NgClass],
})
export class CardAlunoComponent {
  @Input({required: true}) aluno!: Aluno 
}
