import { Component, inject, Input } from '@angular/core';
import { AlunoService } from '../../services/aluno.service';
import { Aluno } from '../../interfaces/aluno';

@Component({
  selector: 'app-dashboard',
  imports: [],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css',
})
export class DashboardComponent {
  private readonly alunoService = inject(AlunoService);

  alunos = 0;
  aprovados = 0;
  reprovados = 0;
  maioresIdade = 0;

  ngOnInit(): void {
    this.alunos = this.alunoService.quantidadeAlunos();
    this.aprovados = this.alunoService.quantidadeAprovados();
    this.reprovados = this.alunoService.quantidadeReprovados();
    this.maioresIdade = this.alunoService.maioresDeIdade();
  }
}
