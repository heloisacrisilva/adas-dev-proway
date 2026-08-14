import { Component, Input } from '@angular/core';
import { Aluno } from '../../interfaces/aluno';
import { NgClass } from "../../../../node_modules/@angular/common"; 

@Component({
  selector: 'app-tabela-alunos',
  imports: [NgClass],
  templateUrl: './tabela-alunos.component.html',
  styleUrl: './tabela-alunos.component.css',
})
export class TabelaAlunosComponent {
  @Input() alunos: Aluno[] = [];
}
